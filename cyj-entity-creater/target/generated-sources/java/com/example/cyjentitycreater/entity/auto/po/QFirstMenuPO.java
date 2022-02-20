package com.example.cyjentitycreater.entity.auto.po;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFirstMenuPO is a Querydsl query type for FirstMenuPO
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFirstMenuPO extends EntityPathBase<FirstMenuPO> {

    private static final long serialVersionUID = 1778876881L;

    public static final QFirstMenuPO firstMenuPO = new QFirstMenuPO("firstMenuPO");

    public final StringPath icon = createString("icon");

    public final StringPath id = createString("id");

    public final StringPath layout = createString("layout");

    public final StringPath menuCode = createString("menuCode");

    public final StringPath menuName = createString("menuName");

    public final StringPath path = createString("path");

    public final StringPath sortCode = createString("sortCode");

    public final StringPath status = createString("status");

    public QFirstMenuPO(String variable) {
        super(FirstMenuPO.class, forVariable(variable));
    }

    public QFirstMenuPO(Path<? extends FirstMenuPO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFirstMenuPO(PathMetadata metadata) {
        super(FirstMenuPO.class, metadata);
    }

}

