package com.example.cyjauth.entity.custom.po;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuthorityPO is a Querydsl query type for AuthorityPO
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuthorityPO extends EntityPathBase<AuthorityCustomPO> {

    private static final long serialVersionUID = -1918742808L;

    public static final QAuthorityPO authorityPO = new QAuthorityPO("authorityPO");

    public final StringPath appApi = createString("appApi");

    public final StringPath appService = createString("appService");

    public final StringPath description = createString("description");

    public final StringPath id = createString("id");

    public final StringPath method = createString("method");

    public final StringPath name = createString("name");

    public final StringPath path = createString("path");

    public final StringPath sortCode = createString("sortCode");

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final StringPath version = createString("version");

    public QAuthorityPO(String variable) {
        super(AuthorityCustomPO.class, forVariable(variable));
    }

    public QAuthorityPO(Path<? extends AuthorityCustomPO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuthorityPO(PathMetadata metadata) {
        super(AuthorityCustomPO.class, metadata);
    }

}

