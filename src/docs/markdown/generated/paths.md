
<a name="paths"></a>
## Paths

<a name="getnewsdetailsbyidusingget"></a>
### 活动详情
```
GET /activity/details
```


#### Description
根据id获取活动详情


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|活动id|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean«Activity»](#49273f84b7c809e6ab01ae29d4ae4888)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`
* `application/json`


#### Tags

* 兴趣活动


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="gethomepageactivitysusingget"></a>
### 首页-活动精彩回顾
```
GET /activity/homepage
```


#### Description
用于首页


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean«List«Activity»»](#21adb7c446f70c271a3471a30f35498e)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`
* `application/json`


#### Tags

* 兴趣活动


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getactivitysusingget"></a>
### 活动列表
```
GET /activity/list
```


#### Description
用于会员中心-兴趣活动菜单


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**pageNum**  <br>*required*|页码|integer (int32)|
|**Query**|**pageSize**  <br>*required*|每页条数|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean«PageInfo«Activity»»](#99b752ed04e3663674cfeb8a0eb3d2c7)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`
* `application/json`


#### Tags

* 兴趣活动


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getbannerusingget"></a>
### 首页其他位置的banner
```
GET /banner/get_banner
```


#### Description
根据位置code获取首页其他的banner


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**location**  <br>*required*|banner在首页的位置|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean«Banner»](#70737815138e649b3b6ae5c57ce840ff)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`
* `application/json`


#### Tags

* banner获取


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="gettopbannersusingget"></a>
### 首页顶部banner
```
GET /banner/get_topbanners
```


#### Description
获取首页顶部banner集合


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean«List«Banner»»](#b8f54ead41e197c10c29285fb14cc943)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`
* `application/json`


#### Tags

* banner获取


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getceolivingroomdetailsbyidusingget"></a>
### CEO会客厅详情
```
GET /ceo/details
```


#### Description
根据id获取详情


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean«CEOLivingRoom»](#e1724ebf3fe0d33b4aefcd67b029e87e)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`
* `application/json`


#### Tags

* CEO会客厅


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="gethomepageceolivingroomusingget"></a>
### 首页-CEO会客厅
```
GET /ceo/homepage
```


#### Description
用于首页


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean«List«CEOLivingRoom»»](#f6774a33af16bf35830db7721a188b5b)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`
* `application/json`


#### Tags

* CEO会客厅


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getceolivingroomusingget"></a>
### CEO会客厅列表
```
GET /ceo/list
```


#### Description
用于会员中心-CEO会客厅菜单


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**pageNum**  <br>*required*|页码|integer (int32)|
|**Query**|**pageSize**  <br>*required*|每页条数|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean«PageInfo«CEOLivingRoom»»](#e16c5764c9b88711b98751b2b2e0d8c1)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`
* `application/json`


#### Tags

* CEO会客厅


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getblogrollsusingget"></a>
### 友情链接
```
GET /hp/blogroll
```


#### Description
用于首页


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean«List«Blogroll»»](#c4795ebcfba793c0ca5851feeeec66d3)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`
* `application/json`


#### Tags

* 首页元素获取


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getpartnersusingget"></a>
### 合作伙伴
```
GET /hp/partners
```


#### Description
用于首页与更多


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean«List«Partner»»](#faf57b8298f2a7c4b6455f338c48fb48)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`
* `application/json`


#### Tags

* 首页元素获取


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="applyformemberusingpost"></a>
### 入会申请
```
POST /memder/apply_for
```


#### Description
入会申请提交


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**from**  <br>*required*|from|[ApplyForMemberFrom](#applyformemberfrom)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean«string»](#b61d141b381b73ecdc6dcec1e323dfb0)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `\*/*`
* `application/json`


#### Tags

* 会员


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getapplyformemberfieldusingget"></a>
### 入会申请表单字段定制
```
GET /memder/applyfor_member_field
```


#### Description
用于渲染表单页面


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean«ApplyForMemberField»](#7d91764dfbd4805cba70bb35456250be)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`
* `application/json`


#### Tags

* 会员


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="gethomepagememberusingget"></a>
### 首页-砖石会员展示
```
GET /memder/homepage
```


#### Description
用于首页


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean«List«MemberShow»»](#99a52a6aa0a2d010370badfad411ae00)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`
* `application/json`


#### Tags

* 会员


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getnewsdetailsbyidusingget_1"></a>
### 新闻详情
```
GET /news/details
```


#### Description
根据id获取新闻详情


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|新闻id|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean«News»](#25c2b3691254f97a479e20b7fd17449f)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`
* `application/json`


#### Tags

* 新闻咨询


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="gethomepagenewsusingget"></a>
### 首页-新闻咨询
```
GET /news/homepage
```


#### Description
用于首页


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean«List«News»»](#6bde33591f7d067e65e64330884f3697)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`
* `application/json`


#### Tags

* 新闻咨询


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getnewsbycodeusingget"></a>
### 新闻列表
```
GET /news/list
```


#### Description
用于新闻菜单的三个列表


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**code**  <br>*required*|policy:人才政策;story:职场故事;news:财经新闻|string|
|**Query**|**pageNum**  <br>*required*|页码|integer (int32)|
|**Query**|**pageSize**  <br>*required*|每页条数|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean«PageInfo«News»»](#62a84225104d5d88d12d5297641de991)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`
* `application/json`


#### Tags

* 新闻咨询


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getpolicysusingget"></a>
### 首页-国内外人才政策
```
GET /news/policys
```


#### Description
用于首页


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean«List«News»»](#6bde33591f7d067e65e64330884f3697)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`
* `application/json`


#### Tags

* 新闻咨询


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="gethomepagenoticesusingget"></a>
### 首页-俱乐部公告
```
GET /notice/homepage
```


#### Description
用于首页


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean«List«Notice»»](#d1a8e1597a213d02c64fae4b87733989)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`
* `application/json`


#### Tags

* 俱乐部公告


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getnoticesusingget"></a>
### 俱乐部公告列表
```
GET /notice/list
```


#### Description
用于更多-俱乐部公告列表


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**pageNum**  <br>*required*|页码|integer (int32)|
|**Query**|**pageSize**  <br>*required*|每页条数|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean«PageInfo«Notice»»](#b1ec87ae605f8f506f57f8cf61c1ad89)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`
* `application/json`


#### Tags

* 俱乐部公告


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|



