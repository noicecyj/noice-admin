package com.example.cyjauth.entity.custom.po;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserCustomPO is a Querydsl query type for UserCustomPO
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserCustomPO extends EntityPathBase<UserCustomPO> {

    private static final long serialVersionUID = -433513355L;

    public static final QUserCustomPO userCustomPO = new QUserCustomPO("userCustomPO");

    public final SetPath<AuthorityCustomPO, QAuthorityCustomPO> authority = this.<AuthorityCustomPO, QAuthorityCustomPO>createSet("authority", AuthorityCustomPO.class, QAuthorityCustomPO.class, PathInits.DIRECT2);

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final StringPath phone = createString("phone");

    public final SetPath<RoleCustomPO, QRoleCustomPO> role = this.<RoleCustomPO, QRoleCustomPO>createSet("role", RoleCustomPO.class, QRoleCustomPO.class, PathInits.DIRECT2);

    public final StringPath sortCode = createString("sortCode");

    public final StringPath status = createString("status");

    public final StringPath userName = createString("userName");

    public QUserCustomPO(String variable) {
        super(UserCustomPO.class, forVariable(variable));
    }

    public QUserCustomPO(Path<? extends UserCustomPO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserCustomPO(PathMetadata metadata) {
        super(UserCustomPO.class, metadata);
    }

}

