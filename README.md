<!--
 ___ _            _ _    _ _    __
/ __(_)_ __  _ __| (_)__(_) |_ /_/
\__ \ | '  \| '_ \ | / _| |  _/ -_)
|___/_|_|_|_| .__/_|_\__|_|\__\___|
            |_| 
-->
![](https://docs.simplicite.io//logos/logo250.png)
* * *

`Crm` module definition
=======================



`CrmAccount` business object definition
---------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmAccName`                                                 | char(30)                                 | yes*     | yes       |          | -                                                                                |
| `crmAccEmployee`                                             | int(10)                                  |          | yes       |          | -                                                                                |
| `crmAccComment`                                              | text(1500)                               |          | yes       |          | -                                                                                |
| `crmAccShortLabel`                                           | char(10)                                 |          | yes       |          | -                                                                                |
| `crmAccSector`                                               | enum(10) using `CRMACCSECTOR` list       | yes      | yes       |          | -                                                                                |
| `crmAccTurnover`                                             | int(11)                                  |          | yes       |          | -                                                                                |
| `crmAccSource`                                               | enum(12) using `CRMACCSOURCE` list       |          | yes       |          | -                                                                                |
| `crmAccId` link to **`CrmAccount`**                          | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmAccId.crmAccName`_                                 | _char(30)_                               |          |           |          | -                                                                                |
| `crmAccColId` link to **`CrmCollaborator`**                  | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmAccColId.usr_login`_                               | _regexp(100)_                            |          |           | yes      | _Login_                                                                          |

### Lists

* `CRMACCSECTOR`
    - `PRI` Private
    - `PUB` Public
    - `ELSE` Else
* `CRMACCSOURCE`
    - `EXHI` Salon
    - `WEB` Website
    - `NET` Réseau

`CrmActCol` business object definition
--------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmActcolActId` link to **`CrmActivity`**                   | id                                       | yes*     | yes       |          | -                                                                                |
| `crmActcolColId` link to **`CrmCollaborator`**               | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `crmActcolColId.usr_login`_                            | _regexp(100)_                            |          |           | yes      | _Login_                                                                          |

`CrmActivity` business object definition
----------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmActWhen`                                                 | datetime                                 | yes      | yes       |          | -                                                                                |
| `crmActGrpId` link to **`CrmGroup`**                         | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmActGrpId.crmGrpName`_                              | _char(20)_                               |          |           |          | -                                                                                |
| `crmActTitle`                                                | char(50)                                 | yes      | yes       |          | -                                                                                |

`CrmCollaborator` business object definition
--------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|

### Custom actions

* `resetPassword`: 

`CrmCompetitor` business object definition
------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmCompName`                                                | char(50)                                 | yes*     | yes       |          | -                                                                                |
| `crmCompComment`                                             | text(1000)                               |          | yes       |          | -                                                                                |

`CrmCompOpp` business object definition
---------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmCompoppCompId` link to **`CrmCompetitor`**               | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `crmCompoppCompId.crmCompName`_                        | _char(50)_                               |          |           |          | -                                                                                |
| _Ref. `crmCompoppCompId.crmCompComment`_                     | _text(1000)_                             |          |           |          | -                                                                                |
| `crmCompoppOppId` link to **`CrmOpportunity`**               | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `crmCompoppOppId.crmOppTitle`_                         | _char(50)_                               |          |           |          | -                                                                                |

`CrmContact` business object definition
---------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmCtcName`                                                 | char(30)                                 | yes      | yes       |          | -                                                                                |
| `crmCtcFirstName`                                            | char(40)                                 | yes*     | yes       |          | -                                                                                |
| `crmCtcAccId` link to **`CrmAccount`**                       | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmCtcAccId.crmAccName`_                              | _char(30)_                               |          |           |          | -                                                                                |
| `crmCtcColId` link to **`CrmCollaborator`**                  | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmCtcColId.usr_login`_                               | _regexp(100)_                            |          |           | yes      | _Login_                                                                          |

`CrmContactHistoric` business object definition
-----------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `row_ref_id` link to **`CrmContact`**                        | id                                       | yes*     |           |          | Record row ID                                                                    |
| `row_idx`                                                    | int(11)                                  | yes*     | yes       |          | History record index                                                             |
| `created_by_hist`                                            | char(100)                                | yes*     |           |          | Created by                                                                       |
| `created_dt_hist`                                            | datetime                                 | yes*     |           |          | Created date                                                                     |
| `crmCtcName`                                                 | char(30)                                 | yes      | yes       |          | -                                                                                |
| `crmCtcFirstName`                                            | char(40)                                 | yes*     | yes       |          | -                                                                                |
| `crmCtcAccId` link to **`CrmAccount`**                       | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmCtcAccId.crmAccName`_                              | _char(30)_                               |          |           |          | -                                                                                |
| `crmCtcColId` link to **`CrmCollaborator`**                  | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmCtcColId.usr_login`_                               | _regexp(100)_                            |          |           | yes      | _Login_                                                                          |

`CrmCtcAct` business object definition
--------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmCtcactCtcId` link to **`CrmContact`**                    | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `crmCtcactCtcId.crmCtcName`_                           | _char(30)_                               |          |           |          | -                                                                                |
| _Ref. `crmCtcactCtcId.crmCtcFirstName`_                      | _char(40)_                               |          |           |          | -                                                                                |
| `crmCtcactActId` link to **`CrmActivity`**                   | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `crmCtcactActId.crmActTitle`_                          | _char(50)_                               |          |           |          | -                                                                                |

`CrmCtcOpp` business object definition
--------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmCtcoppCtcId` link to **`CrmContact`**                    | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `crmCtcoppCtcId.crmCtcName`_                           | _char(30)_                               |          |           |          | -                                                                                |
| _Ref. `crmCtcoppCtcId.crmCtcFirstName`_                      | _char(40)_                               |          |           |          | -                                                                                |
| `crmCtcoppOppId` link to **`CrmOpportunity`**                | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `crmCtcoppOppId.crmOppTitle`_                          | _char(50)_                               |          |           |          | -                                                                                |

`CrmGroup` business object definition
-------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmGrpName`                                                 | char(20)                                 | yes*     | yes       |          | -                                                                                |
| `crmGroupGeoPerimeter`                                       | enum(50) using `CRM_COUNTRY` list        |          | yes       |          | Geographical perimeter of a group                                                |
| `crmGrpId` link to **`CrmGroup`**                            | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmGrpId.crmGrpName`_                                 | _char(20)_                               |          |           |          | -                                                                                |
| _Ref. `crmGrpId.crmGroupGeoPerimeter`_                       | _enum(50) using `CRM_COUNTRY` list_      |          |           |          | _Geographical perimeter of a group_                                              |

### Lists

* `CRM_COUNTRY`

`CrmLead` business object definition
------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmLeadCreation`                                            | date                                     | yes      | yes       |          | -                                                                                |
| _Ref. `crmLeadCtcId.crmCtcName`_                             | _char(30)_                               |          |           |          | -                                                                                |
| `crmLeadDirection`                                           | enum(15) using `CRMLEADDIRECTION` list   |          | yes       |          | -                                                                                |
| _Ref. `crmLeadCtcId.crmCtcFirstName`_                        | _char(40)_                               |          |           |          | -                                                                                |
| `crmLeadTitle`                                               | char(30)                                 | yes      | yes       |          | -                                                                                |
| _Ref. `crmLeadColId.usr_last_name`_                          | _char(50)_                               |          |           | yes      | _Last name_                                                                      |
| `crmLeadState`                                               | enum(15) using `CRMLEADSTATE` list       | yes      | yes       |          | -                                                                                |
| _Ref. `crmLeadColId.usr_first_name`_                         | _char(50)_                               |          |           | yes      | _First name_                                                                     |
| _Ref. `crmCtcAccId.crmAccName`_                              | _char(30)_                               |          |           |          | -                                                                                |
| `crmLeadCtcId` link to **`CrmContact`**                      | id                                       | yes      | yes       |          | -                                                                                |
| _Ref. `crmLeadCtcId.crmCtcAccId`_                            | _id_                                     |          |           |          | -                                                                                |
| _Ref. `crmLeadCtcId.crmCtcUsrId`_                            | _id_                                     |          |           |          | -                                                                                |
| _Ref. `crmCtcUsrId.usr_login`_                               | _regexp(100)_                            |          |           | yes      | _Login_                                                                          |
| `crmLeadGrpId` link to **`CrmGroup`**                        | id                                       |          | yes       |          | -                                                                                |
| `crmLeadColId` link to **`CrmCollaborator`**                 | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmLeadColId.usr_login`_                              | _regexp(100)_                            |          |           | yes      | _Login_                                                                          |

### Lists

* `CRMLEADDIRECTION`
    - `N` None
    - `O` Outgoing
    - `I` Incoming
* `CRMLEADSTATE`
    - `TBQ` To be qualified
    - `OK` OK
    - `KO` KO

`CrmMeanOfContact` business object definition
---------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmMocType`                                                 | enum(20) using `CRMMOCTYPE` list         | yes      | yes       |          | -                                                                                |
| `crmMocContent`                                              | char(30)                                 | yes*     | yes       |          | -                                                                                |
| `crmMocPriority`                                             | enum(1) using `CRM_MOC_PRIORITY` list    | yes      | yes       |          | -                                                                                |
| `crmMocCtcId` link to **`CrmContact`**                       | id                                       | yes      | yes       |          | -                                                                                |
| _Ref. `crmMocCtcId.crmCtcName`_                              | _char(30)_                               |          |           |          | -                                                                                |
| _Ref. `crmMocCtcId.crmCtcFirstName`_                         | _char(40)_                               |          |           |          | -                                                                                |

### Lists

* `CRMMOCTYPE`
    - `Email` Email
    - `Phone` Mobile
    - `Fax` Fax
* `CRM_MOC_PRIORITY`
    - `1` 
    - `2` 
    - `3` 

`CrmMembership` business object definition
------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmGrpcolGrpId` link to **`CrmGroup`**                      | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `crmGrpcolGrpId.crmGrpName`_                           | _char(20)_                               |          |           |          | -                                                                                |
| `crmGrpcolColId` link to **`CrmCollaborator`**               | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `crmGrpcolColId.usr_login`_                            | _regexp(100)_                            |          |           | yes      | _Login_                                                                          |

`CrmOppAct` business object definition
--------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| _Ref. `crmOppactOppId.crmOppTitle`_                          | _char(50)_                               |          |           |          | -                                                                                |
| `crmOppactOppId` link to **`CrmOpportunity`**                | id                                       | yes*     | yes       |          | -                                                                                |
| `crmOppactActId` link to **`CrmActivity`**                   | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `crmOppactActId.crmActTitle`_                          | _char(50)_                               |          |           |          | -                                                                                |

`CrmOpportunity` business object definition
-------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmOppTitle`                                                | char(50)                                 | yes*     | yes       |          | -                                                                                |
| `crmOppState`                                                | enum(15) using `CRM_OPP_STATE` list      | yes      | yes       |          | -                                                                                |
| `crmOppDirectStatus`                                         | enum(10) using `CRM_OPP_DIRECT_STATUS` list | yes      | yes       |          | -                                                                                |
| `crmOppColId` link to **`CrmCollaborator`**                  | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmOppColId.usr_login`_                               | _regexp(100)_                            |          |           | yes      | _Login_                                                                          |
| _Ref. `crmOppColId.usr_first_name`_                          | _char(50)_                               |          |           | yes      | _First name_                                                                     |
| _Ref. `crmOppColId.usr_last_name`_                           | _char(50)_                               |          |           | yes      | _Last name_                                                                      |
| `crmOppGrpId` link to **`CrmGroup`**                         | id                                       |          | yes       |          | -                                                                                |
| `crmOppLeadId` link to **`CrmLead`**                         | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmOppLeadId.crmLeadTitle`_                           | _char(30)_                               |          |           |          | -                                                                                |
| `crmOppAccId` link to **`CrmAccount`**                       | id                                       |          | yes       |          | -                                                                                |

### Lists

* `CRM_OPP_STATE`
    - `Qualification` 
    - `Offer` 
* `CRM_OPP_DIRECT_STATUS`
    - `Ingoing` 
    - `Outgoing` 

`CrmOppPrd` business object definition
--------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmOppprdOppId` link to **`CrmOpportunity`**                | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `crmOppprdOppId.crmOppTitle`_                          | _char(50)_                               |          |           |          | -                                                                                |
| `crmOppprdPrdId` link to **`CrmProduct`**                    | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `crmOppprdPrdId.crmPrdLabel`_                          | _char(30)_                               |          |           |          | -                                                                                |

`CrmProduct` business object definition
---------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmPrdLabel`                                                | char(30)                                 | yes*     | yes       |          | -                                                                                |
| `crmPrdPrice`                                                | int(11)                                  | yes      | yes       |          | -                                                                                |

