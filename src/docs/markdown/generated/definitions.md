
<a name="definitions"></a>
## Definitions

<a name="activity"></a>
### Activity
活动


|Name|Description|Schema|
|---|---|---|
|**content**  <br>*optional*|内容,html格式 富文本发布|string|
|**createTime**  <br>*optional*|发布时间|string|
|**description**  <br>*optional*|描述,用于列表展示|string|
|**hpImgUrl**  <br>*optional*|首页图片地址|string|
|**id**  <br>*optional*|id|integer (int64)|
|**listImgUrl**  <br>*optional*|列表图片地址|string|
|**title**  <br>*optional*|标题|string|
|**videoUrl**  <br>*optional*|视频地址,列表页有视频优先展示视频|string|
|**viewCount**  <br>*optional*|阅读量|integer (int64)|


<a name="applyformemberfield"></a>
### ApplyForMemberField
入会申请表单定制


|Name|Description|Schema|
|---|---|---|
|**canEmpty**  <br>*optional*|字段是否必填|boolean|
|**fieldName**  <br>*optional*|字段名称|string|
|**fieldOrder**  <br>*optional*|排序, 模块下|boolean|
|**fieldPlacehoder**  <br>*optional*|字段默认显示文字|string|
|**fieldType**  <br>*optional*|字段类型:input;textarea;select;checkbox|string|
|**module**  <br>*optional*|所属模块:个人信息:personalInfo;公司信息:companyInfo;自我介绍:self-introduction|string|


<a name="applyformemberfrom"></a>
### ApplyForMemberFrom
入会申请表单,这里的参数是全量具体提交参考表单字段定制


|Name|Description|Schema|
|---|---|---|
|**affectiveState**  <br>*optional*|affectiveState|string|
|**birthdate**  <br>*optional*|出生日期|string|
|**company**  <br>*optional*|公司名|string|
|**detailedAddress**  <br>*optional*|detailedAddress|string|
|**hobbies**  <br>*optional*|hobbies|string|
|**jobTitle**  <br>*optional*|职位|string|
|**mailAddress**  <br>*optional*|邮箱|string|
|**name**  <br>*optional*|姓名|string|
|**phoneNumber**  <br>*optional*||string|
|**region**  <br>*optional*|职位|string|
|**selfIntroduction**  <br>*optional*|selfIntroduction|string|
|**sex**  <br>*optional*|性别|string|


<a name="banner"></a>
### Banner
Banner,用于首页多个位置


|Name|Description|Schema|
|---|---|---|
|**imgUrl**  <br>*optional*|图片地址|string|
|**targetUrl**  <br>*optional*|跳转地址,没有返回值则不支持跳转|string|


<a name="blogroll"></a>
### Blogroll
友情链接


|Name|Description|Schema|
|---|---|---|
|**name**  <br>*optional*|显示文字|string|
|**targetUrl**  <br>*optional*|跳转地址,没有返回值则不支持跳转|string|


<a name="ceolivingroom"></a>
### CEOLivingRoom
CEO会客厅,三个图片；（首页大图，小图，列表图）有播放


|Name|Description|Schema|
|---|---|---|
|**content**  <br>*optional*|内容,html格式 富文本发布|string|
|**createTime**  <br>*optional*|发布时间|string|
|**description**  <br>*optional*|描述,用于列表展示|string|
|**hpImgUrl**  <br>*optional*|首页图片地址|string|
|**hpSmallImgUrl**  <br>*optional*|首页小图片地址|string|
|**id**  <br>*optional*|id|integer (int64)|
|**listImgUrl**  <br>*optional*|列表图片地址|string|
|**title**  <br>*optional*|标题|string|
|**videoUrl**  <br>*optional*|视频地址,列表页有视频优先展示视频|string|
|**viewCount**  <br>*optional*|阅读量|integer (int64)|


<a name="membershow"></a>
### MemberShow
砖石会员展示


|Name|Description|Schema|
|---|---|---|
|**imgUrl**  <br>*optional*|图片地址|string|
|**jobTitle**  <br>*optional*|职位|string|
|**name**  <br>*optional*|名字|string|


<a name="news"></a>
### News
新闻


|Name|Description|Schema|
|---|---|---|
|**content**  <br>*optional*|新闻内容,html格式 富文本发布|string|
|**createTime**  <br>*optional*|新闻发布时间|string|
|**description**  <br>*optional*|描述,用于列表展示|string|
|**hpImgUrl**  <br>*optional*|首页图片地址|string|
|**id**  <br>*optional*|新闻id|integer (int64)|
|**listImgUrl**  <br>*optional*|列表图片地址|string|
|**title**  <br>*optional*|新闻标题|string|
|**viewCount**  <br>*optional*|阅读量|integer (int64)|


<a name="notice"></a>
### Notice
俱乐部公告


|Name|Description|Schema|
|---|---|---|
|**createTime**  <br>*optional*|发布时间|string|
|**description**  <br>*optional*|描述,用于列表展示|string|
|**id**  <br>*optional*|id|integer (int64)|
|**title**  <br>*optional*|标题|string|


<a name="4d16cc392b4e5034ce889138b9eb7758"></a>
### PageInfo«Activity»

|Name|Schema|
|---|---|
|**endRow**  <br>*optional*|integer (int32)|
|**firstPage**  <br>*optional*|integer (int32)|
|**hasNextPage**  <br>*optional*|boolean|
|**hasPreviousPage**  <br>*optional*|boolean|
|**isFirstPage**  <br>*optional*|boolean|
|**isLastPage**  <br>*optional*|boolean|
|**lastPage**  <br>*optional*|integer (int32)|
|**list**  <br>*optional*|< [Activity](#activity) > array|
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


<a name="9d63aaec8fa614a9ac51380b57f899b7"></a>
### PageInfo«News»

|Name|Schema|
|---|---|
|**endRow**  <br>*optional*|integer (int32)|
|**firstPage**  <br>*optional*|integer (int32)|
|**hasNextPage**  <br>*optional*|boolean|
|**hasPreviousPage**  <br>*optional*|boolean|
|**isFirstPage**  <br>*optional*|boolean|
|**isLastPage**  <br>*optional*|boolean|
|**lastPage**  <br>*optional*|integer (int32)|
|**list**  <br>*optional*|< [News](#news) > array|
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


<a name="7112f1189c43494a244f8bac7803462d"></a>
### PageInfo«Notice»

|Name|Schema|
|---|---|
|**endRow**  <br>*optional*|integer (int32)|
|**firstPage**  <br>*optional*|integer (int32)|
|**hasNextPage**  <br>*optional*|boolean|
|**hasPreviousPage**  <br>*optional*|boolean|
|**isFirstPage**  <br>*optional*|boolean|
|**isLastPage**  <br>*optional*|boolean|
|**lastPage**  <br>*optional*|integer (int32)|
|**list**  <br>*optional*|< [Notice](#notice) > array|
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


<a name="49273f84b7c809e6ab01ae29d4ae4888"></a>
### ResponseBean«Activity»

|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|[Activity](#activity)|
|**message**  <br>*optional*|信息|string|
|**status**  <br>*optional*|状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限|integer (int32)|


<a name="7d91764dfbd4805cba70bb35456250be"></a>
### ResponseBean«ApplyForMemberField»

|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|[ApplyForMemberField](#applyformemberfield)|
|**message**  <br>*optional*|信息|string|
|**status**  <br>*optional*|状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限|integer (int32)|


<a name="70737815138e649b3b6ae5c57ce840ff"></a>
### ResponseBean«Banner»

|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|[Banner](#banner)|
|**message**  <br>*optional*|信息|string|
|**status**  <br>*optional*|状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限|integer (int32)|


<a name="e1724ebf3fe0d33b4aefcd67b029e87e"></a>
### ResponseBean«CEOLivingRoom»

|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|[CEOLivingRoom](#ceolivingroom)|
|**message**  <br>*optional*|信息|string|
|**status**  <br>*optional*|状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限|integer (int32)|


<a name="21adb7c446f70c271a3471a30f35498e"></a>
### ResponseBean«List«Activity»»

|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|< [Activity](#activity) > array|
|**message**  <br>*optional*|信息|string|
|**status**  <br>*optional*|状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限|integer (int32)|


<a name="b8f54ead41e197c10c29285fb14cc943"></a>
### ResponseBean«List«Banner»»

|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|< [Banner](#banner) > array|
|**message**  <br>*optional*|信息|string|
|**status**  <br>*optional*|状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限|integer (int32)|


<a name="c4795ebcfba793c0ca5851feeeec66d3"></a>
### ResponseBean«List«Blogroll»»

|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|< [Blogroll](#blogroll) > array|
|**message**  <br>*optional*|信息|string|
|**status**  <br>*optional*|状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限|integer (int32)|


<a name="f6774a33af16bf35830db7721a188b5b"></a>
### ResponseBean«List«CEOLivingRoom»»

|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|< [CEOLivingRoom](#ceolivingroom) > array|
|**message**  <br>*optional*|信息|string|
|**status**  <br>*optional*|状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限|integer (int32)|


<a name="99a52a6aa0a2d010370badfad411ae00"></a>
### ResponseBean«List«MemberShow»»

|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|< [MemberShow](#membershow) > array|
|**message**  <br>*optional*|信息|string|
|**status**  <br>*optional*|状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限|integer (int32)|


<a name="6bde33591f7d067e65e64330884f3697"></a>
### ResponseBean«List«News»»

|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|< [News](#news) > array|
|**message**  <br>*optional*|信息|string|
|**status**  <br>*optional*|状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限|integer (int32)|


<a name="d1a8e1597a213d02c64fae4b87733989"></a>
### ResponseBean«List«Notice»»

|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|< [Notice](#notice) > array|
|**message**  <br>*optional*|信息|string|
|**status**  <br>*optional*|状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限|integer (int32)|


<a name="faf57b8298f2a7c4b6455f338c48fb48"></a>
### ResponseBean«List«Partner»»

|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|< [Partner](#partner) > array|
|**message**  <br>*optional*|信息|string|
|**status**  <br>*optional*|状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限|integer (int32)|


<a name="25c2b3691254f97a479e20b7fd17449f"></a>
### ResponseBean«News»

|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|[News](#news)|
|**message**  <br>*optional*|信息|string|
|**status**  <br>*optional*|状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限|integer (int32)|


<a name="99b752ed04e3663674cfeb8a0eb3d2c7"></a>
### ResponseBean«PageInfo«Activity»»

|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|[PageInfo«Activity»](#4d16cc392b4e5034ce889138b9eb7758)|
|**message**  <br>*optional*|信息|string|
|**status**  <br>*optional*|状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限|integer (int32)|


<a name="e16c5764c9b88711b98751b2b2e0d8c1"></a>
### ResponseBean«PageInfo«CEOLivingRoom»»

|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|[PageInfo«CEOLivingRoom»](#02013b33703439b2bec757627b714af6)|
|**message**  <br>*optional*|信息|string|
|**status**  <br>*optional*|状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限|integer (int32)|


<a name="62a84225104d5d88d12d5297641de991"></a>
### ResponseBean«PageInfo«News»»

|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|[PageInfo«News»](#9d63aaec8fa614a9ac51380b57f899b7)|
|**message**  <br>*optional*|信息|string|
|**status**  <br>*optional*|状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限|integer (int32)|


<a name="b1ec87ae605f8f506f57f8cf61c1ad89"></a>
### ResponseBean«PageInfo«Notice»»

|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|[PageInfo«Notice»](#7112f1189c43494a244f8bac7803462d)|
|**message**  <br>*optional*|信息|string|
|**status**  <br>*optional*|状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限|integer (int32)|


<a name="b61d141b381b73ecdc6dcec1e323dfb0"></a>
### ResponseBean«string»

|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|数据|string|
|**message**  <br>*optional*|信息|string|
|**status**  <br>*optional*|状态 0:成功;401:参数不对;402:参数值不对;502:系统内部错误,506:无操作权限|integer (int32)|



