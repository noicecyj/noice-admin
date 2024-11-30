package noice.common.utils;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Data
public class SearchModel<T> {

    private Integer pageIndex;
    private Integer pageSize;
    private List<FieldItem> fieldItems;
    private List<SelectItem> selectItems;
    private String orderField;
    private boolean isAsc;

    public SearchModel(List<FieldItem> fieldItems) {
        this.fieldItems = fieldItems;
    }

    public SearchModel(List<FieldItem> fieldItems, List<SelectItem> selectItems) {
        this.fieldItems = fieldItems;
        this.selectItems = selectItems;
    }

    public SearchModel(String... fieldItems) {
        for (String str : fieldItems) {
            String name = str.getClass().getName();
            FieldItem fieldItem = new FieldItem(name, str);
            this.fieldItems.add(fieldItem);
        }
    }

    public SearchModel(Object dto) {
        try {
            this.fieldItems = getSearchModelFieldList(dto);
            this.selectItems = getSearchModelSelectList(dto);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public SearchModel(Object dto, List<SelectItem> selectItems) {
        try {
            this.fieldItems = getSearchModelFieldList(dto);
            this.selectItems = selectItems;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public SearchModel(Integer pageIndex, Integer pageSize, Object dto) {
        try {
            this.pageIndex = pageIndex;
            this.pageSize = pageSize;
            this.fieldItems = getSearchModelFieldList(dto);
            this.selectItems = getSearchModelSelectList(dto);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public SearchModel(Integer pageIndex, Integer pageSize, Object dto, List<SelectItem> selectItems) {
        try {
            this.pageIndex = pageIndex;
            this.pageSize = pageSize;
            this.selectItems = selectItems;
            this.fieldItems = getSearchModelFieldList(dto);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public SearchModel(Integer pageIndex, Integer pageSize, List<FieldItem> fieldItems) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.fieldItems = fieldItems;
    }

    public SearchModel(Integer pageIndex, Integer pageSize, List<FieldItem> fieldItems, List<SelectItem> selectItems) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.fieldItems = fieldItems;
        this.selectItems = selectItems;
    }

    public IPage<T> getPage() {
        IPage<T> page = new Page<>(pageIndex, pageSize);
        if (StringUtils.isNotEmpty(orderField)) {
            OrderItem orderItem = new OrderItem();
            orderItem.setAsc(isAsc);
            orderItem.setColumn(orderField);
            page.orders().add(orderItem);
        }
        return page;
    }

    public QueryWrapper<T> getQueryModel() {
        QueryWrapper<T> queryWrapper = new QueryWrapper<>();
        List<String> selectFieldList = new ArrayList<>();
        for (SelectItem selectItem : selectItems) {
            String selectField = StrUtil.toUnderlineCase(selectItem.getName());
            if (StringUtils.isNotEmpty(selectItem.getAlias())) {
                selectField = selectField + " as " + selectItem.getAlias();
            }
            selectFieldList.add(selectField);
        }
        if (!selectFieldList.isEmpty()) {
            queryWrapper.select(selectFieldList);
        }
        for (FieldItem fieldItem : this.fieldItems) {
            switch (fieldItem.getQueryMethod()) {
                case eq:
                    queryWrapper.eq(true, StrUtil.toUnderlineCase(fieldItem.getName()), fieldItem.getValue());
                    break;
                case like:
                    queryWrapper.like(true, StrUtil.toUnderlineCase(fieldItem.getName()), fieldItem.getValue());
            }
        }
        if (StringUtils.isNotEmpty(orderField)) {
            queryWrapper.orderBy(true, isAsc, StrUtil.toUnderlineCase(orderField));
        }
        queryWrapper.orderBy(true, true, "sort_code");
        return queryWrapper;
    }

    public QueryWrapper<T> getNameAndIdQueryModel() {
        this.selectItems.stream()
                .filter(selectItem -> "id".equals(selectItem.getName()) || selectItem.getName().contains("name"))
                .forEach(selectItem -> {
                    if ("id".equals(selectItem.getName())) {
                        selectItem.setAlias("value");
                    }
                    if (selectItem.getName().contains("name")) {
                        selectItem.setAlias("label");
                    }
                });
        return getQueryModel();
    }

    private List<FieldItem> getSearchModelFieldList(Object o) throws IllegalAccessException {
        List<FieldItem> fieldItemList = new ArrayList<>();
        Class clazz = o.getClass();
        List<Field> fields = new ArrayList<>();
        while (clazz != null) {
            fields.addAll(new ArrayList<>(List.of(clazz.getDeclaredFields())));
            clazz = clazz.getSuperclass();
        }
        for (Field field : fields) {
            field.setAccessible(true);
            if (!"DTO".equals(field.getName()) && field.get(o) != null && field.get(o) instanceof String) {
                FieldItem fieldItemOne = new FieldItem(field.getName(), field.get(o), QueryMethod.like);
                fieldItemList.add(fieldItemOne);
            }
        }
        return fieldItemList;
    }

    private List<SelectItem> getSearchModelSelectList(Object o) throws IllegalAccessException {
        List<SelectItem> selectItemList = new ArrayList<>();
        Class clazz = o.getClass();
        List<Field> fields = new ArrayList<>();
        while (clazz != null) {
            fields.addAll(new ArrayList<>(List.of(clazz.getDeclaredFields())));
            clazz = clazz.getSuperclass();
        }
        for (Field field : fields) {
            field.setAccessible(true);
            if (!"DTO".equals(field.getName()) && field.get(o) instanceof String) {
                SelectItem fieldItemOne = new SelectItem(field.getName());
                selectItemList.add(fieldItemOne);
            }
        }
        return selectItemList;
    }

}