package noice.handler.bean;

import noice.common.entity.vo.ResultVO;
import noice.handler.vo.BaseVoBean;

import java.util.List;

/**
 * @author Noice
 */
public interface BeanController<VO extends BaseVoBean> {

    ResultVO page(VO vo);

    ResultVO get(String id);

    ResultVO getList(List<String> ids);

    ResultVO add(VO vo);

    ResultVO update(VO vo);

    ResultVO delete(String id);

    ResultVO getValueEnum(VO vo);

    ResultVO getOptions(VO vo);
    
}