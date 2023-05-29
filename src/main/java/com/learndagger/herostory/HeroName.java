package com.learndagger.herostory;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author 高超（gaochao.cc）
 * @since 2023/5/28
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface HeroName {
}
