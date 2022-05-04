package com.example.cyjworkflow.entity.auto.po;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFlowUserPO is a Querydsl query type for FlowUserPO
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFlowUserPO extends EntityPathBase<FlowUserPO> {

    private static final long serialVersionUID = -1036970937L;

    public static final QFlowUserPO flowUserPO = new QFlowUserPO("flowUserPO");

    public final StringPath email = createString("email");

    public final StringPath firstName = createString("firstName");

    public final StringPath id = createString("id");

    public final StringPath secondName = createString("secondName");

    public final StringPath sortCode = createString("sortCode");

    public final StringPath status = createString("status");

    public QFlowUserPO(String variable) {
        super(FlowUserPO.class, forVariable(variable));
    }

    public QFlowUserPO(Path<? extends FlowUserPO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFlowUserPO(PathMetadata metadata) {
        super(FlowUserPO.class, metadata);
    }

}

