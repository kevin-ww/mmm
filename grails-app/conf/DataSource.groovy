//dataSource {
//    pooled = true
//    driverClassName = "org.h2.Driver"
//    username = "sa"
//    password = ""
//}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
//    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4

}

// environment specific settings
environments {
    development {
//        dataSource {
//            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
//            url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
//        }
        dataSource {
            dbCreate = "update"
            driverClassName = "com.mysql.jdbc.Driver"
            url = "jdbc:mysql://localhost:3306/magicw?useUnicode=true&characterEncoding=utf8&autoReconnect=true"
            username = "root"
            password = ""
            logSql = true
            formatSql = true
            properties {
                timeBetweenEvictionRunsMillis = 1000 * 60 * 30
                minEvictableIdleTimeMillis = 1000 * 60 * 30
                testOnBorrow = true
                testWhileIdle = false
                testOnReturn = false
                validationQuery = "SELECT 1"
            }
        }
        test {
            dataSource {
                dbCreate = "update"
                url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
            }
        }
        production {
            dataSource {
                dbCreate = "update"
                url = "jdbc:h2:prodDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
                properties {
                    maxActive = -1
                    minEvictableIdleTimeMillis = 1800000
                    timeBetweenEvictionRunsMillis = 1800000
                    numTestsPerEvictionRun = 3
                    testOnBorrow = true
                    testWhileIdle = true
                    testOnReturn = false
                    validationQuery = "SELECT 1"
                    jdbcInterceptors = "ConnectionState"
                }
            }
        }
    }
}