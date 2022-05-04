package com.example.cyjworkflow.entity.auto.po;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFlowGroupPO is a Querydsl query type for FlowGroupPO
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFlowGroupPO extends EntityPathBase<FlowGroupPO> {

    private static final long serialVersionUID = -1640751327L;

    public static final QFlowGroupPO flowGroupPO = new QFlowGroupPO("flowGroupPO");

    public final StringPath groupName = createString("groupName");

    public final StringPath groupType = createString("groupType");

    public final StringPath id = createString("id");

    public final StringPath sortCode = createString("sortCode");

    public final StringPath status = createString("status");

    public QFlowGroupPO(String variable) {
        super(FlowGroupPO.class, forVariable(variable));
    }

    public QFlowGroupPO(Path<? extends FlowGroupPO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFlowGroupPO(PathMetadata metadata) {
        super(FlowGroupPO.class, metadata);
    }

}

