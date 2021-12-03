package com.example.cyjentitycreater.entity.auto.po;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEntityNamePO is a Querydsl query type for EntityNamePO
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEntityNamePO extends EntityPathBase<EntityNamePO> {

    private static final long serialVersionUID = -986886006L;

    public static final QEntityNamePO entityNamePO = new QEntityNamePO("entityNamePO");

    public final StringPath appId = createString("appId");

    public final StringPath entityCode = createString("entityCode");

    public final StringPath entityName = createString("entityName");

    public final NumberPath<Integer> entityStatus = createNumber("entityStatus", Integer.class);

    public final StringPath entityType = createString("entityType");

    public final StringPath id = createString("id");

    public final StringPath pid = createString("pid");

    public final StringPath sortCode = createString("sortCode");

    public QEntityNamePO(String variable) {
        super(EntityNamePO.class, forVariable(variable));
    }

    public QEntityNamePO(Path<? extends EntityNamePO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEntityNamePO(PathMetadata metadata) {
        super(EntityNamePO.class, metadata);
    }

}

