
<a name="definitions"></a>
## Definitions

<a name="applyfrom"></a>
### ApplyFrom
申请入会表单

*Type* : object


<a name="article"></a>
### Article
人才政策, 职场故事，新闻, 公告, 活动回顾


|Name|Description|Schema|
|---|---|---|
|**articleType**  <br>*optional*|policy-人才政策, story-职场故事，news-新闻, notice-公告, activity-活动回顾|string|
|**content**  <br>*optional*|内容,富文本发布|string|
|**desc**  <br>*optional*|描述,用于列表展示|string|
|**id**  <br>*optional*|id|integer (int64)|
|**imgUrl**  <br>*optional*|图片地址,首页与列表共用|string|
|**publishTime**  <br>*optional*|发布时间|string|
|**title**  <br>*optional*|标题|string|
|**viewCount**  <br>*optional*|阅读量|integer (int64)|


<a name="banner"></a>
### Banner
Banner,用于首页多个位置


|Name|Description|Schema|
|---|---|---|
|**imgUrl**  <br>*optional*|图片地址|string|
|**targetUrl**  <br>*optional*|跳转地址,没有返回值则不支持跳转|string|


<a name="ceolivingroom"></a>
### CEOLivingRoom
CEO会客厅,三个图片；（首页大图，小图，列表图）视频访谈


|Name|Description|Schema|
|---|---|---|
|**bigImgUrl**  <br>*optional*|首页大图片地址|string|
|**content**  <br>*optional*|内容,html格式 富文本发布|string|
|**desc**  <br>*optional*|描述,用于列表展示|string|
|**id**  <br>*optional*|id|integer (int64)|
|**publishTime**  <br>*optional*|发布时间|string|
|**rankImgUrl**  <br>*optional*|列表图片地址|string|
|**smallImgUrl**  <br>*optional*|首页小图片地址|string|
|**title**  <br>*optional*|标题|string|
|**videoUrl**  <br>*optional*|视频地址,列表页有视频优先展示视频|string|
|**viewCount**  <br>*optional*|阅读量|integer (int64)|


<a name="dynaminform"></a>
### DynaminForm
动态表单


|Name|Description|Schema|
|---|---|---|
|**fields**  <br>*optional*|fields|[FormFields](#formfields)|
|**formCode**  <br>*optional*|formCode|string|


<a name="formfields"></a>
### FormFields
动态表单字段定义


|Name|Description|Schema|
|---|---|---|
|**canEmpty**  <br>*optional*|canEmpty|string|
|**fieldName**  <br>*optional*|fieldName|string|
|**fieldPlaceholder**  <br>*optional*|fieldPlaceholder|string|
|**fieldType**  <br>*optional*|fieldType|string|
|**formGroupTitle**  <br>*optional*|formGroupTitle|string|
|**order**  <br>*optional*|order|integer (int32)|


<a name="links"></a>
### Links
友情链接


|Name|Description|Schema|
|---|---|---|
|**name**  <br>*optional*|显示文字|string|
|**targetUrl**  <br>*optional*|跳转地址,没有返回值则不支持跳转|string|


<a name="membershow"></a>
### MemberShow
砖石会员展示


|Name|Description|Schema|
|---|---|---|
|**desc**  <br>*optional*|职位|string|
|**imgUrl**  <br>*optional*|图片地址|string|
|**name**  <br>*optional*|名字|string|


<a name="386bc978c1d95a4136274b9777488ea7"></a>
### PageInfo«Article»

|Name|Schema|
|---|---|
|**endRow**  <br>*optional*|integer (int32)|
|**firstPage**  <br>*optional*|integer (int32)|
|**hasNextPage**  <br>*optional*|boolean|
|**hasPreviousPage**  <br>*optional*|boolean|
|**isFirstPage**  <br>*optional*|boolean|
|**isLastPage**  <br>*optional*|boolean|
|**lastPage**  <br>*optional*|integer (int32)|
|**list**  <br>*optional*|< [Article](#article) > array|
|**navigateFirstPage**  <br>*optional*|integer (int32)|
|**navigateLastPage**  <br>*optional*|integer (int32)|
|**navigatePages**  <br>*optional*|integer (int32)|
|**navigatepageNums**  <br>*optional*|< integer (int32) > array|
|**nextPage**  <br>*optional*|integer (int32)|
|**pageNum**  <br>*optional*|integer (int32)|
|**pageSize**  <br>*optional*|integer (int32)|
|**pages**  <br>*optional*|integer (int32)|
|**prePage**  <br>*optional*|integer (int32)|
|**size**  <br>*optional*|integer (int32)|
|**startRow**  <br>*optional*|integer (int32)|
|**total**  <br>*optional*|integer (int64)|


<a name="02013b33703439b2bec757627b714af6"></a>
### PageInfo«CEOLivingRoom»

|Name|Schema|
|---|---|
|**endRow**  <br>*optional*|integer (int32)|
|**firstPage**  <br>*optional*|integer (int32)|
|**hasNextPage**  <br>*optional*|boolean|
|**hasPreviousPage**  <br>*optional*|boolean|
|**isFirstPage**  <br>*optional*|boolean|
|**isLastPage**  <br>*optional*|boolean|
|**lastPage**  <br>*optional*|integer (int32)|
|**list**  <br>*optional*|< [CEOLivingRoom](#ceolivingroom) > array|
|**navigateFirstPage**  <br>*optional*|integer (int32)|
|**navigateLastPage**  <br>*optional*|integer (int32)|
|**navigatePages**  <br>*optional*|integer (int32)|
|**navigatepageNums**  <br>*optional*|< integer (int32) > array|
|**nextPage**  <br>*optional*|integer (int32)|
|**pageNum**  <br>*optional*|integer (int32)|
|**pageSize**  <br>*optional*|integer (int32)|
|**pages**  <br>*optional*|integer (int32)|
|**prePage**  <br>*optional*|integer (int32)|
|**size**  <br>*optional*|integer (int32)|
|**startRow**  <br>*optional*|integer (int32)|
|**total**  <br>*optional*|integer (int64)|


<a name="e798b730d95322a16960330c7277cea3"></a>
### PageInfo«Links»

|Name|Schema|
|---|---|
|**endRow**  <br>*optional*|integer (int32)|
|**firstPage**  <br>*optional*|integer (int32)|
|**hasNextPage**  <br>*optional*|boolean|
|**hasPreviousPage**  <br>*optional*|boolean|
|**isFirstPage**  <br>*optional*|boolean|
|**isLastPage**  <br>*optional*|boolean|
|**lastPage**  <br>*optional*|integer (int32)|
|**list**  <br>*optional*|< [Links](#links) > array|
|**navigateFirstPage**  <br>*optional*|integer (int32)|
|**navigateLastPage**  <br>*optional*|integer (int32)|
|**navigatePages**  <br>*optional*|integer (int32)|
|**navigatepageNums**  <br>*optional*|< integer (int32) > array|
|**nextPage**  <br>*optional*|integer (int32)|
|**pageNum**  <br>*optional*|integer (int32)|
|**pageSize**  <br>*optional*|integer (int32)|
|**pages**  <br>*optional*|integer (int32)|
|**prePage**  <br>*optional*|integer (int32)|
|**size**  <br>*optional*|integer (int32)|
|**startRow**  <br>*optional*|integer (int32)|
|**total**  <br>*optional*|integer (int64)|


<a name="184c0a8dd5fac445b361394c42836b12"></a>
### PageInfo«MemberShow»

|Name|Schema|
|---|---|
|**endRow**  <br>*optional*|integer (int32)|
|**firstPage**  <br>*optional*|integer (int32)|
|**hasNextPage**  <br>*optional*|boolean|
|**hasPreviousPage**  <br>*optional*|boolean|
|**isFirstPage**  <br>*optional*|boolean|
|**isLastPage**  <br>*optional*|boolean|
|**lastPage**  <br>*optional*|integer (int32)|
|**list**  <br>*optional*|< [MemberShow](#membershow) > array|
|**navigateFirstPage**  <br>*optional*|integer (int32)|
|**navigateLastPage**  <br>*optional*|integer (int32)|
|**navigatePages**  <br>*optional*|integer (int32)|
|**navigatepageNums**  <br>*optional*|< integer (int32) > array|
|**nextPage**  <br>*optional*|integer (int32)|
|**pageNum**  <br>*optional*|integer (int32)|
|**pageSize**  <br>*optional*|integer (int32)|
|**pages**  <br>*optional*|integer (int32)|
|**prePage**  <br>*optional*|integer (int32)|
|**size**  <br>*optional*|integer (int32)|
|**startRow**  <br>*optional*|integer (int32)|
|**total**  <br>*optional*|integer (int64)|


<a name="8e4cf1f97e237e61b1237002f72391bf"></a>
### PageInfo«Partner»

|Name|Schema|
|---|---|
|**endRow**  <br>*optional*|integer (int32)|
|**firstPage**  <br>*optional*|integer (int32)|
|**hasNextPage**  <br>*optional*|boolean|
|**hasPreviousPage**  <br>*optional*|boolean|
|**isFirstPage**  <br>*optional*|boolean|
|**isLastPage**  <br>*optional*|boolean|
|**lastPage**  <br>*optional*|integer (int32)|
|**list**  <br>*optional*|< [Partner](#partner) > array|
|**navigateFirstPage**  <br>*optional*|integer (int32)|
|**navigateLastPage**  <br>*optional*|integer (int32)|
|**navigatePages**  <br>*optional*|integer (int32)|
|**navigatepageNums**  <br>*optional*|< integer (int32) > array|
|**nextPage**  <br>*optional*|integer (int32)|
|**pageNum**  <br>*optional*|integer (int32)|
|**pageSize**  <br>*optional*|integer (int32)|
|**pages**  <br>*optional*|integer (int32)|
|**prePage**  <br>*optional*|integer (int32)|
|**size**  <br>*optional*|integer (int32)|
|**startRow**  <br>*optional*|integer (int32)|
|**total**  <br>*optional*|integer (int64)|


<a name="partner"></a>
### Partner
合作伙伴


|Name|Description|Schema|
|---|---|---|
|**imgUrl**  <br>*optional*|图片地址|string|
|**targetUrl**  <br>*optional*|跳转地址,没有返回值则不支持跳转|string|


<a name="plate"></a>
### Plate
页面板块


|Name|Description|Schema|
|---|---|---|
|**contentId**  <br>*optional*|板块内容id|integer (int32)|
|**dateType**  <br>*optional*|版本内容类型: <br> - 0-banner<br>        - 1-自动榜单|string|
|**id**  <br>*optional*|板块id|integer (int32)|
|**menuCode**  <br>*optional*|菜单code|integer (int32)|
|**menuId**  <br>*optional*|菜单id|integer (int32)|
|**order**  <br>*optional*|排序|integer (int32)|
|**platName**  <br>*optional*|板块名称|string|
|**showType**  <br>*optional*|板块展示样式：<br> - 0-多图banner<br>        - 1-单图banner<br>        - 2-首页两列文字榜单，如：国内外人才政策，公告<br>        - 3-首页CEO会客厅<br>        - 4-首页钻石会员展示<br>        - 5-首页新闻<br>        - 6-首页活动<br>        - 7-合作伙伴<br>        - 8-友情链接<br>        - 9-文章列表，如：新闻咨询下的人才政策，会员中心下的兴趣活动<br>        - 11-动态表单， 如：入会申请|string|


<a name="platecontent"></a>
### PlateContent
板块内容


|Name|Description|Schema|
|---|---|---|
|**articles**  <br>*optional*|文章榜单，接口不回返回该字段，统一在content返回|[Rank«Article»](#0c1607b22a589add5b1f1852e3713e26)|
|**banners**  <br>*optional*|图片banner，接口不回返回该字段，统一在content返回|< [Banner](#banner) > array|
|**ceoLivingRooms**  <br>*optional*|CEO会客厅榜单，接口不回返回该字段，统一在content返回|[Rank«CEOLivingRoom»](#1d95d01fe6a3cd0e7f7b0684b8aca539)|
|**content**  <br>*optional*|板块内容|object|
|**contentId**  <br>*optional*|板块内容id|integer (int32)|
|**dynaminForm**  <br>*optional*|动态表单，接口不回返回该字段，统一在content返回|[DynaminForm](#dynaminform)|
|**links**  <br>*optional*|友情链接，接口不回返回该字段，统一在content返回|[Rank«Links»](#e1381737aecc9b167775d493945ac27e)|
|**memberShows**  <br>*optional*|钻石会员展示，接口不回返回该字段，统一在content返回|[Rank«MemberShow»](#f5ee948534f10821c4a6713d244769df)|
|**partners**  <br>*optional*|合作伙伴，接口不回返回该字段，统一在content返回|[Rank«Partner»](#e5cd68029e604fa546e7ba958ba61463)|


<a name="0c1607b22a589add5b1f1852e3713e26"></a>
### Rank«Article»
榜单


|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|< [Article](#article) > array|
|**hasMore**  <br>*optional*|是否有更多按钮(0-没有 1-有)|integer (int32)|
|**pageData**  <br>*optional*|数据支持分页|[PageInfo«Article»](#386bc978c1d95a4136274b9777488ea7)|
|**rankCode**  <br>*optional*|code|string|
|**rankIcon**  <br>*optional*|logo|string|
|**rankId**  <br>*optional*|id|integer (int32)|
|**rankName**  <br>*optional*|name|string|


<a name="1d95d01fe6a3cd0e7f7b0684b8aca539"></a>
### Rank«CEOLivingRoom»
榜单


|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|< [CEOLivingRoom](#ceolivingroom) > array|
|**hasMore**  <br>*optional*|是否有更多按钮(0-没有 1-有)|integer (int32)|
|**pageData**  <br>*optional*|数据支持分页|[PageInfo«CEOLivingRoom»](#02013b33703439b2bec757627b714af6)|
|**rankCode**  <br>*optional*|code|string|
|**rankIcon**  <br>*optional*|logo|string|
|**rankId**  <br>*optional*|id|integer (int32)|
|**rankName**  <br>*optional*|name|string|


<a name="e1381737aecc9b167775d493945ac27e"></a>
### Rank«Links»
榜单


|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|< [Links](#links) > array|
|**hasMore**  <br>*optional*|是否有更多按钮(0-没有 1-有)|integer (int32)|
|**pageData**  <br>*optional*|数据支持分页|[PageInfo«Links»](#e798b730d95322a16960330c7277cea3)|
|**rankCode**  <br>*optional*|code|string|
|**rankIcon**  <br>*optional*|logo|string|
|**rankId**  <br>*optional*|id|integer (int32)|
|**rankName**  <br>*optional*|name|string|


<a name="f5ee948534f10821c4a6713d244769df"></a>
### Rank«MemberShow»
榜单


|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|< [MemberShow](#membershow) > array|
|**hasMore**  <br>*optional*|是否有更多按钮(0-没有 1-有)|integer (int32)|
|**pageData**  <br>*optional*|数据支持分页|[PageInfo«MemberShow»](#184c0a8dd5fac445b361394c42836b12)|
|**rankCode**  <br>*optional*|code|string|
|**rankIcon**  <br>*optional*|logo|string|
|**rankId**  <br>*optional*|id|integer (int32)|
|**rankName**  <br>*optional*|name|string|


<a name="e5cd68029e604fa546e7ba958ba61463"></a>
### Rank«Partner»
榜单


|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|< [Partner](#partner) > array|
|**hasMore**  <br>*optional*|是否有更多按钮(0-没有 1-有)|integer (int32)|
|**pageData**  <br>*optional*|数据支持分页|[PageInfo«Partner»](#8e4cf1f97e237e61b1237002f72391bf)|
|**rankCode**  <br>*optional*|code|string|
|**rankIcon**  <br>*optional*|logo|string|
|**rankId**  <br>*optional*|id|integer (int32)|
|**rankName**  <br>*optional*|name|string|


<a name="e4fbcd07ddfd55831efa16153cee8a36"></a>
### ResponseBean«List«Plate»»
统一响应对象


|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|< [Plate](#plate) > array|
|**message**  <br>*optional*|信息|string|
|**status**  <br>*optional*|状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限|integer (int32)|


<a name="a300a5a348079f73ddfd1e94c534f6ab"></a>
### ResponseBean«PlateContent»
统一响应对象


|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|[PlateContent](#platecontent)|
|**message**  <br>*optional*|信息|string|
|**status**  <br>*optional*|状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限|integer (int32)|


<a name="b61d141b381b73ecdc6dcec1e323dfb0"></a>
### ResponseBean«string»
统一响应对象


|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|string|
|**message**  <br>*optional*|信息|string|
|**status**  <br>*optional*|状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限|integer (int32)|



