package com.example.cyjentitycreater.entity.auto.po;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSecondMenuPO is a Querydsl query type for SecondMenuPO
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSecondMenuPO extends EntityPathBase<SecondMenuPO> {

    private static final long serialVersionUID = 1844344367L;

    public static final QSecondMenuPO secondMenuPO = new QSecondMenuPO("secondMenuPO");

    public final StringPath component = createString("component");

    public final StringPath id = createString("id");

    public final StringPath menuCode = createString("menuCode");

    public final StringPath menuName = createString("menuName");

    public final StringPath path = createString("path");

    public final StringPath pid = createString("pid");

    public final StringPath sortCode = createString("sortCode");

    public final StringPath status = createString("status");

    public QSecondMenuPO(String variable) {
        super(SecondMenuPO.class, forVariable(variable));
    }

    public QSecondMenuPO(Path<? extends SecondMenuPO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSecondMenuPO(PathMetadata metadata) {
        super(SecondMenuPO.class, metadata);
    }

}

