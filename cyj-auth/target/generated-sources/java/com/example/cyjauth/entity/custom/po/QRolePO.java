package com.example.cyjauth.entity.custom.po;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRolePO is a Querydsl query type for RolePO
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRolePO extends EntityPathBase<RoleCustomPO> {

    private static final long serialVersionUID = -979772721L;

    public static final QRolePO rolePO = new QRolePO("rolePO");

    public final SetPath<AuthorityCustomPO, QAuthorityPO> authority = this.<AuthorityCustomPO, QAuthorityPO>createSet("authority", AuthorityCustomPO.class, QAuthorityPO.class, PathInits.DIRECT2);

    public final StringPath description = createString("description");

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public final StringPath sortCode = createString("sortCode");

    public final StringPath status = createString("status");

    public final StringPath value = createString("value");

    public QRolePO(String variable) {
        super(RoleCustomPO.class, forVariable(variable));
    }

    public QRolePO(Path<? extends RoleCustomPO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRolePO(PathMetadata metadata) {
        super(RoleCustomPO.class, metadata);
    }

}

