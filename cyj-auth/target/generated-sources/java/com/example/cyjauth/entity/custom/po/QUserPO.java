package com.example.cyjauth.entity.custom.po;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserPO is a Querydsl query type for UserPO
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserPO extends EntityPathBase<UserCustomPO> {

    private static final long serialVersionUID = -890387228L;

    public static final QUserPO userPO = new QUserPO("userPO");

    public final SetPath<AuthorityCustomPO, QAuthorityPO> authority = this.<AuthorityCustomPO, QAuthorityPO>createSet("authority", AuthorityCustomPO.class, QAuthorityPO.class, PathInits.DIRECT2);

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final StringPath phone = createString("phone");

    public final SetPath<RoleCustomPO, QRolePO> role = this.<RoleCustomPO, QRolePO>createSet("role", RoleCustomPO.class, QRolePO.class, PathInits.DIRECT2);

    public final StringPath sortCode = createString("sortCode");

    public final StringPath status = createString("status");

    public final StringPath userName = createString("userName");

    public QUserPO(String variable) {
        super(UserCustomPO.class, forVariable(variable));
    }

    public QUserPO(Path<? extends UserCustomPO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserPO(PathMetadata metadata) {
        super(UserCustomPO.class, metadata);
    }

}

