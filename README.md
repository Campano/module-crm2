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



`CRM_GRP_PERIMETER` business object definition
----------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|

`CrmAccount` business object definition
---------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| _Ref. `crmAccSectorActId.crmSasNumber`_                      | _id_                                     |          |           |          | -                                                                                |
| `crmAccParentName`                                           | char(30)                                 | yes*     | yes       |          | -                                                                                |
| `crmAccShortLabel`                                           | char(10)                                 |          | yes       |          | -                                                                                |
| `crmAccSector`                                               | enum(10) using `CRMACCSECTOR` list       | yes      | yes       |          | -                                                                                |
| `crmAccSectorActId` link to **`CrmAccSectorAct`**            | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmAccSectorActId.crmSasLabel`_                       | _char(30)_                               |          |           |          | -                                                                                |
| `crmAccTurnover`                                             | int(11)                                  |          | yes       |          | -                                                                                |
| `crmAccParentId` link to **`CrmAccount`**                    | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmAccParentId.crmAccParentName`_                     | _char(30)_                               |          |           |          | -                                                                                |
| `crmAccEmployee`                                             | int(10)                                  |          | yes       |          | -                                                                                |
| `crmAccColId` link to **`CrmCollaborator`**                  | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmAccColId.usr_login`_                               | _regexp(100)_                            |          |           | yes      | _Login_                                                                          |
| `crmAccLeadSourceId` link to **`CrmLeadSource`**             | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmAccLeadSourceId.crmLeadSourceValue`_               | _char(30)_                               |          |           |          | -                                                                                |
| `crmAccComment`                                              | text(1500)                               |          | yes       |          | -                                                                                |
| `crmAccCountry`                                              | char(60)                                 |          | yes       |          | -                                                                                |
| `crmAccStreet`                                               | char(100)                                |          | yes       |          | -                                                                                |
| `crmAccPostalCode`                                           | int(10)                                  |          | yes       |          | -                                                                                |
| `crmAccCity`                                                 | char(100)                                |          | yes       |          | -                                                                                |
| `crmAccWebsite`                                              | url(100)                                 |          | yes       |          | -                                                                                |
| `crmAccPhone`                                                | phone(10)                                |          | yes       |          | -                                                                                |

### Lists

* `CRMACCSECTOR`
    - `PRI` Private
    - `PUB` Public
    - `ELSE` Else

`CrmAccSectorAct` business object definition
--------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmSasLabel`                                                | char(30)                                 | yes*     | yes       |          | -                                                                                |

`CrmActCol` business object definition
--------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmActcolActId` link to **`CrmActivity`**                   | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `crmActcolActId.crmActTitle`_                          | _char(50)_                               |          |           |          | -                                                                                |
| _Ref. `crmActcolActId.crmActWhen`_                           | _datetime_                               |          |           |          | -                                                                                |
| `crmActcolColId` link to **`CrmCollaborator`**               | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `crmActcolColId.usr_login`_                            | _regexp(100)_                            |          |           | yes      | _Login_                                                                          |
| _Ref. `crmActcolColId.usr_last_name`_                        | _char(50)_                               |          |           | yes      | _Last name_                                                                      |
| _Ref. `crmActcolColId.usr_first_name`_                       | _char(50)_                               |          |           | yes      | _First name_                                                                     |

`CrmActivity` business object definition
----------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmActWhen`                                                 | datetime                                 | yes      | yes       |          | -                                                                                |
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
| `crmCtcNumber`                                               | int(11)                                  | *        |           |          | -                                                                                |
| `crmCtcName`                                                 | char(30)                                 | yes      | yes       |          | -                                                                                |
| `crmCtcFirstName`                                            | char(40)                                 | yes      | yes       |          | -                                                                                |
| `crmCtcCivility`                                             | enum(10) using `CRM_CTC_CIVILITY` list   |          | yes       |          | -                                                                                |
| `crmCtcCreationDate`                                         | datetime                                 |          | yes       |          | -                                                                                |
| `crmCtcMobile`                                               | phone(15)                                |          | yes       |          | -                                                                                |
| `crmCtcEmail`                                                | email(30)                                |          | yes       |          | -                                                                                |
| `crmCtcPhone`                                                | phone(15)                                |          | yes       |          | -                                                                                |
| `crmCtcService`                                              | char(50)                                 |          | yes       |          | -                                                                                |
| `crmCtcFunction`                                             | char(50)                                 |          | yes       |          | -                                                                                |
| `crmCtcAddress`                                              | char(100)                                |          | yes       |          | -                                                                                |
| `crmCtcPostalCode`                                           | int(5)                                   |          | yes       |          | -                                                                                |
| `crmCtcCity`                                                 | char(50)                                 |          | yes       |          | -                                                                                |
| `crmCtcColId` link to **`CrmCollaborator`**                  | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmCtcColId.usr_login`_                               | _regexp(100)_                            |          |           | yes      | _Login_                                                                          |
| `crmCtcAccId` link to **`CrmAccount`**                       | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmCtcAccId.crmAccParentName`_                        | _char(30)_                               |          |           |          | -                                                                                |
| `crmCtcComment`                                              | text(2000)                               |          | yes       |          | -                                                                                |

### Lists

* `CRM_CTC_CIVILITY`
    - `Mr` 
    - `Ms` 

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
| `crmCtcFirstName`                                            | char(40)                                 | yes      | yes       |          | -                                                                                |
| `crmCtcAccId` link to **`CrmAccount`**                       | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmCtcAccId.crmAccParentName`_                        | _char(30)_                               |          |           |          | -                                                                                |
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

`CrmLead` business object definition
------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmLeadTitle`                                               | char(30)                                 | yes      | yes       |          | -                                                                                |
| `crmLeadCreation`                                            | datetime                                 | yes      |           |          | -                                                                                |
| `crmLeadDirection`                                           | enum(15) using `CRMLEADDIRECTION` list   |          | yes       |          | -                                                                                |
| `crmLeadState`                                               | enum(15) using `CRMLEADSTATE` list       | yes      | yes       |          | -                                                                                |
| `crmLeadDescription`                                         | text(2000)                               |          | yes       |          | -                                                                                |
| `crmLeadSrcId` link to **`CrmLeadSource`**                   | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmLeadSrcId.crmLeadSourceValue`_                     | _char(30)_                               |          |           |          | -                                                                                |
| `crmLeadColId` link to **`CrmCollaborator`**                 | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmLeadColId.usr_login`_                              | _regexp(100)_                            |          |           | yes      | _Login_                                                                          |
| `crmLeadCtcId` link to **`CrmContact`**                      | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmLeadCtcId.crmCtcNumber`_                           | _int(11)_                                |          |           |          | -                                                                                |
| _Ref. `crmLeadCtcId.crmCtcName`_                             | _char(30)_                               |          |           |          | -                                                                                |
| _Ref. `crmLeadCtcId.crmCtcFirstName`_                        | _char(40)_                               |          |           |          | -                                                                                |
| `crmLeadAccId` link to **`CrmAccount`**                      | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmLeadAccId.crmAccParentName`_                       | _char(30)_                               |          |           |          | -                                                                                |

### Lists

* `CRMLEADDIRECTION`
    - `N` None
    - `I` Ingoing
    - `O` Outgoing
* `CRMLEADSTATE`
    - `TBQ` To be qualified
    - `OK` OK
    - `KO` KO

`CrmLeadSource` business object definition
------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmLeadSourceValue`                                         | char(30)                                 | yes*     | yes       |          | -                                                                                |

`CrmMeanOfContact` business object definition
---------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmMocType`                                                 | enum(20) using `CRMMOCTYPE` list         | yes      | yes       |          | -                                                                                |
| `crmMocContent`                                              | char(30)                                 | yes*     | yes       |          | -                                                                                |
| `crmMocPriority`                                             | enum(1) using `CRM_MOC_PRIORITY` list    | yes      | yes       |          | -                                                                                |
| `crmMocCtcId` link to **`CrmContact`**                       | id                                       | yes      | yes       |          | -                                                                                |

### Lists

* `CRMMOCTYPE`
    - `Email` Email
    - `Phone` Mobile
    - `Fax` Fax
* `CRM_MOC_PRIORITY`
    - `1` 
    - `2` 
    - `3` 

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
| `crmOppAmount`                                               | float(11, 2)                             |          | yes       |          | -                                                                                |
| `crmOppEstimatedAmount`                                      | float(11, 2)                             |          | yes       |          | -                                                                                |
| `crmOppColId` link to **`CrmCollaborator`**                  | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmOppColId.usr_login`_                               | _regexp(100)_                            |          |           | yes      | _Login_                                                                          |
| _Ref. `crmOppColId.usr_first_name`_                          | _char(50)_                               |          |           | yes      | _First name_                                                                     |
| _Ref. `crmOppColId.usr_last_name`_                           | _char(50)_                               |          |           | yes      | _Last name_                                                                      |
| `crmOppLeadId` link to **`CrmLead`**                         | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmOppLeadId.crmLeadTitle`_                           | _char(30)_                               |          |           |          | -                                                                                |
| `crmOppAccId` link to **`CrmAccount`**                       | id                                       |          | yes       |          | -                                                                                |

### Lists

* `CRM_OPP_STATE`
    - `Draft` 
    - `Prospection` 
    - `Qualification` 
    - `Offer` 
    - `Negociation` 
    - `Won` 
    - `Lost` 
    - `Abandonned` 
* `CRM_OPP_DIRECT_STATUS`
    - `Ingoing` 
    - `Outgoing` 

`CrmOppPrd` business object definition
--------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| _Ref. `crmOppprdPrdId.crmPrdPrice`_                          | _float(11, 2)_                           |          |           |          | -                                                                                |
| `crmOppPrdQuantity`                                          | int(11)                                  | yes      | yes       |          | -                                                                                |
| `crmOppprdOppId` link to **`CrmOpportunity`**                | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `crmOppprdOppId.crmOppTitle`_                          | _char(50)_                               |          |           |          | -                                                                                |
| _Ref. `crmOppprdOppId.crmOppAmount`_                         | _float(11, 2)_                           |          |           |          | -                                                                                |
| `crmOppprdPrdId` link to **`CrmProduct`**                    | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `crmOppprdPrdId.crmPrdLabel`_                          | _char(30)_                               |          |           |          | -                                                                                |

`CrmPerimeter` business object definition
-----------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|

`CrmProduct` business object definition
---------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmPrdLabel`                                                | char(30)                                 | yes*     | yes       |          | -                                                                                |
| `crmPrdPrice`                                                | float(11, 2)                             | yes      | yes       |          | -                                                                                |
| `crmPrdRef`                                                  | char(40)                                 |          | yes       |          | -                                                                                |
| `crmPrdStock`                                                | int(11)                                  |          | yes       |          | -                                                                                |
| `crmPrdDescription`                                          | text(1000)                               |          | yes       |          | -                                                                                |
| `crmPrdStatus`                                               | enum(10) using `CRM_PRD_STATUS` list     |          | yes       |          | -                                                                                |
| `crmPrdType`                                                 | enum(20) using `CRM_PRD_TYPE` list       |          | yes       |          | -                                                                                |
| `crmPrdBillingMethod`                                        | enum(25) using `CRM_PRD_BILL_METHOD` list | yes      | yes       |          | -                                                                                |

### Lists

* `CRM_PRD_STATUS`
* `CRM_PRD_TYPE`
    - `Subscription` 
    - `Service` 
    - `Merchandise` 
* `CRM_PRD_BILL_METHOD`
    - `Unitary` 
    - `Daily` 
    - `Weekly` 
    - `Monthly` 
    - `Yearly` 

