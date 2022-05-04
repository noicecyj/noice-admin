package com.example.cyjworkflow.entity.auto.po;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFlowTenantPO is a Querydsl query type for FlowTenantPO
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFlowTenantPO extends EntityPathBase<FlowTenantPO> {

    private static final long serialVersionUID = -1136723418L;

    public static final QFlowTenantPO flowTenantPO = new QFlowTenantPO("flowTenantPO");

    public final StringPath id = createString("id");

    public final StringPath sortCode = createString("sortCode");

    public final StringPath status = createString("status");

    public final StringPath tenantName = createString("tenantName");

    public QFlowTenantPO(String variable) {
        super(FlowTenantPO.class, forVariable(variable));
    }

    public QFlowTenantPO(Path<? extends FlowTenantPO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFlowTenantPO(PathMetadata metadata) {
        super(FlowTenantPO.class, metadata);
    }

}

