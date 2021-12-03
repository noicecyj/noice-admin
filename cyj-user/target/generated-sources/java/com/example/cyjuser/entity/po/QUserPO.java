package com.example.cyjuser.entity.po;

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
public class QUserPO extends EntityPathBase<UserPO> {

    private static final long serialVersionUID = 1417340430L;

    public static final QUserPO userPO = new QUserPO("userPO");

    public final SetPath<AuthorityPO, QAuthorityPO> authority = this.<AuthorityPO, QAuthorityPO>createSet("authority", AuthorityPO.class, QAuthorityPO.class, PathInits.DIRECT2);

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final StringPath phone = createString("phone");

    public final SetPath<RolePO, QRolePO> role = this.<RolePO, QRolePO>createSet("role", RolePO.class, QRolePO.class, PathInits.DIRECT2);

    public final StringPath sortCode = createString("sortCode");

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final StringPath userName = createString("userName");

    public QUserPO(String variable) {
        super(UserPO.class, forVariable(variable));
    }

    public QUserPO(Path<? extends UserPO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserPO(PathMetadata metadata) {
        super(UserPO.class, metadata);
    }

}

