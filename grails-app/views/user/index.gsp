
<%@ page import="com.kvn.magicw.User" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'user.label', default: 'User')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>
<a href="#list-user" class="skip" tabindex="-1"><g:message code="default.link.skip.label"
                                                                                  default="Skip to content&hellip;"/></a>

<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
        <li><g:link class="create" action="create"><g:message code="default.new.label"
                                                              args="[entityName]"/></g:link></li>
    </ul>
</div>

<div id="list-user" class="content scaffold-list" role="main">
    <h1><g:message code="default.list.label" args="[entityName]"/></h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>
    <table>
        <thead>
        <tr>
            
            <g:sortableColumn property="ageBracket"
                              title="${message(code: 'user.ageBracket.label', default: 'Age Bracket')}"/>
            
            <g:sortableColumn property="dateCreated"
                              title="${message(code: 'user.dateCreated.label', default: 'Date Created')}"/>
            
            <g:sortableColumn property="gender"
                              title="${message(code: 'user.gender.label', default: 'Gender')}"/>
            
            <g:sortableColumn property="interestAffinityCategory"
                              title="${message(code: 'user.interestAffinityCategory.label', default: 'Interest Affinity Category')}"/>
            
            <g:sortableColumn property="interestInMarketCategory"
                              title="${message(code: 'user.interestInMarketCategory.label', default: 'Interest In Market Category')}"/>
            
            <g:sortableColumn property="interestOtherCategory"
                              title="${message(code: 'user.interestOtherCategory.label', default: 'Interest Other Category')}"/>
            
        </tr>
        </thead>
        <tbody>
        <g:each in="${userInstanceList}" status="i" var="userInstance">
            <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
                
                <td><g:link action="show" id="${userInstance.id}">${fieldValue(bean: userInstance, field: "ageBracket")}</g:link></td>
                
                <td><g:formatDate date="${userInstance.dateCreated}"/></td>
                
                <td>${fieldValue(bean: userInstance, field: "gender")}</td>
                
                <td>${fieldValue(bean: userInstance, field: "interestAffinityCategory")}</td>
                
                <td>${fieldValue(bean: userInstance, field: "interestInMarketCategory")}</td>
                
                <td>${fieldValue(bean: userInstance, field: "interestOtherCategory")}</td>
                
            </tr>
        </g:each>
        </tbody>
    </table>

    <div class="pagination">
        <g:paginate total="${userInstanceCount ?: 0}"/>
    </div>
</div>
</body>
</html>
