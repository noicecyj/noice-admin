package com.example.cyjauth.entity.custom.po;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoleCustomPO is a Querydsl query type for RoleCustomPO
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRoleCustomPO extends EntityPathBase<RoleCustomPO> {

    private static final long serialVersionUID = -1576413664L;

    public static final QRoleCustomPO roleCustomPO = new QRoleCustomPO("roleCustomPO");

    public final SetPath<AuthorityCustomPO, QAuthorityCustomPO> authority = this.<AuthorityCustomPO, QAuthorityCustomPO>createSet("authority", AuthorityCustomPO.class, QAuthorityCustomPO.class, PathInits.DIRECT2);

    public final StringPath description = createString("description");

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public final StringPath sortCode = createString("sortCode");

    public final StringPath status = createString("status");

    public final StringPath value = createString("value");

    public QRoleCustomPO(String variable) {
        super(RoleCustomPO.class, forVariable(variable));
    }

    public QRoleCustomPO(Path<? extends RoleCustomPO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRoleCustomPO(PathMetadata metadata) {
        super(RoleCustomPO.class, metadata);
    }

}

