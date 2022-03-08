package com.example.cyjauth.entity.custom.po;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuthorityCustomPO is a Querydsl query type for AuthorityCustomPO
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuthorityCustomPO extends EntityPathBase<AuthorityCustomPO> {

    private static final long serialVersionUID = -1050209415L;

    public static final QAuthorityCustomPO authorityCustomPO = new QAuthorityCustomPO("authorityCustomPO");

    public final StringPath appName = createString("appName");

    public final StringPath description = createString("description");

    public final StringPath id = createString("id");

    public final StringPath method = createString("method");

    public final StringPath name = createString("name");

    public final StringPath path = createString("path");

    public final StringPath sortCode = createString("sortCode");

    public final StringPath status = createString("status");

    public final StringPath version = createString("version");

    public QAuthorityCustomPO(String variable) {
        super(AuthorityCustomPO.class, forVariable(variable));
    }

    public QAuthorityCustomPO(Path<? extends AuthorityCustomPO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuthorityCustomPO(PathMetadata metadata) {
        super(AuthorityCustomPO.class, metadata);
    }

}

