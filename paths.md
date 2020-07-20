
<a name="paths"></a>
## Paths

<a name="getplatecontentbyidusingget"></a>
### 板块内容
```
GET /content/plate_content
```


#### Description
根据板块id获取内容


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**contentId**  <br>*required*|板块内容id|string|
|**Query**|**pageNum**  <br>*optional*|页码,需要分页的内容才传此参数|integer (int32)|
|**Query**|**pageSize**  <br>*optional*|每页条数,需要分页的内容才传此参数|integer (int32)|
|**Query**|**searchKey**  <br>*optional*|搜索词,在新闻列表内容时传值达到筛选的功能|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean«PlateContent»](#a300a5a348079f73ddfd1e94c534f6ab)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`
* `application/json`


#### Tags

* mctc官网内容服务


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getplatesbymenuusingget"></a>
### 页面板块
```
GET /content/plates
```


#### Description
根据菜单code获取此菜单页面下的板块列表


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**menuCode**  <br>*required*|菜单code,前后端事先约定|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean«List«Plate»»](#e4fbcd07ddfd55831efa16153cee8a36)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`
* `application/json`


#### Tags

* mctc官网内容服务


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
|**Body**|**from**  <br>*required*|from|[ApplyFrom](#applyfrom)|


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



