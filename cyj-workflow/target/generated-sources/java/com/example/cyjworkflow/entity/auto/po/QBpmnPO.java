package com.example.cyjworkflow.entity.auto.po;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBpmnPO is a Querydsl query type for BpmnPO
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBpmnPO extends EntityPathBase<BpmnPO> {

    private static final long serialVersionUID = -167769443L;

    public static final QBpmnPO bpmnPO = new QBpmnPO("bpmnPO");

    public final StringPath id = createString("id");

    public final StringPath processName = createString("processName");

    public final StringPath processXml = createString("processXml");

    public final StringPath sortCode = createString("sortCode");

    public final StringPath status = createString("status");

    public final StringPath uploadFile = createString("uploadFile");

    public QBpmnPO(String variable) {
        super(BpmnPO.class, forVariable(variable));
    }

    public QBpmnPO(Path<? extends BpmnPO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBpmnPO(PathMetadata metadata) {
        super(BpmnPO.class, metadata);
    }

}

