package noice.handler.relation;

import noice.common.entity.vo.ResultVO;
import noice.handler.vo.BaseVoRelation;

import java.util.List;

/**
 * @author Noice
 */
public interface RelationController<VO extends BaseVoRelation> {

    ResultVO get(VO vo);

    ResultVO set(List<String> ids, List<VO> voList);

}