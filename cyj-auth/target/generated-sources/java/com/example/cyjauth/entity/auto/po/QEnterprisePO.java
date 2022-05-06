package com.example.cyjauth.entity.auto.po;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEnterprisePO is a Querydsl query type for EnterprisePO
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEnterprisePO extends EntityPathBase<EnterprisePO> {

    private static final long serialVersionUID = -276761672L;

    public static final QEnterprisePO enterprisePO = new QEnterprisePO("enterprisePO");

    public final StringPath enterpriseAdmin = createString("enterpriseAdmin");

    public final StringPath enterpriseDescription = createString("enterpriseDescription");

    public final StringPath enterpriseName = createString("enterpriseName");

    public final StringPath id = createString("id");

    public final StringPath sortCode = createString("sortCode");

    public final StringPath status = createString("status");

    public QEnterprisePO(String variable) {
        super(EnterprisePO.class, forVariable(variable));
    }

    public QEnterprisePO(Path<? extends EnterprisePO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEnterprisePO(PathMetadata metadata) {
        super(EnterprisePO.class, metadata);
    }

}

