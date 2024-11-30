package noice.handler.base;

import lombok.Data;
import noice.handler.base.enumType.ClassEnum;
import noice.handler.base.enumType.StatementEnum;

import java.util.ArrayList;
import java.util.List;

@Data
public class ClassBase {

    /**
     * 包名
     */
    public String packageName;

    /**
     * 类注释
     */
    public List<String> classNote;

    /**
     * 声明
     */
    public StatementEnum classStatement;

    /**
     * 类型
     */
    public ClassEnum classType;

    /**
     * 类名
     */
    public String className;

    public String extendsClassName;

    public List<String> classAnnotationList;

    public List<String> importPackageList;

    public List<FieldBase> fieldList;

    public List<MethodBase> methodList;

    public void setClassNote() {
        classNote = new ArrayList<>();
        classNote.add("/**");
        classNote.add(" * @author Noice");
        classNote.add(" */");
    }

}

