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

### Lists

* `CRMACCSECTOR`
    - `PRI` Private
    - `PUB` Public
    - `ELSE` Else
* `CRMACCSOURCE`
    - `EXHI` Salon
    - `WEB` Website
    - `NET` Réseau

`CrmCollaborator` business object definition
--------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `usr_login`                                                  | regexp(100)                              | yes*     | yes       | yes      | Login                                                                            |
| `usr_first_name`                                             | char(50)                                 |          | yes       | yes      | First name                                                                       |
| `usr_last_name`                                              | char(50)                                 |          | yes       | yes      | Last name                                                                        |
| `usr_lang`                                                   | enum(3) using `LANG` list                | yes      | yes       | yes      | Language                                                                         |
| `usr_email`                                                  | email(100)                               |          | yes       | yes      | Email address                                                                    |
| `usr_cell_num`                                               | phone(20)                                |          | yes       | yes      | Mobile/cellular phone number                                                     |
| `usr_active`                                                 | enum(1) using `USER_STATUS` list         |          | yes       |          | -                                                                                |

### Lists

* `LANG`
    - `ENU` English language
    - `FRA` French language
* `USER_STATUS`
    - `0` Disabled
    - `1` Enabled
    - `2` Pending
    - `3` Web services only

`CrmContact` business object definition
---------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmCtcName`                                                 | char(30)                                 | yes*     | yes       |          | -                                                                                |
| `crmCtcAccId` link to **`CrmAccount`**                       | id                                       | yes      | yes       |          | -                                                                                |
| _Ref. `crmCtcAccId.crmAccName`_                              | _char(30)_                               |          |           |          | -                                                                                |

`CrmGroup` business object definition
-------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmGrpName`                                                 | char(20)                                 | yes*     | yes       |          | -                                                                                |

`CrmLead` business object definition
------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmLeadCreation`                                            | date                                     | yes      | yes       |          | -                                                                                |
| `crmLeadDirection`                                           | enum(15) using `CRMLEADDIRECTION` list   |          | yes       |          | -                                                                                |
| `crmLeadTitle`                                               | char(30)                                 | yes      | yes       |          | -                                                                                |
| `crmLeadState`                                               | enum(15) using `CRMLEADSTATE` list       | yes      | yes       |          | -                                                                                |
| `crmLeadCtcId` link to **`CrmContact`**                      | id                                       | yes      | yes       |          | -                                                                                |
| _Ref. `crmLeadCtcId.crmCtcName`_                             | _char(30)_                               |          |           |          | -                                                                                |
| _Ref. `crmCtcAccId.crmAccName`_                              | _char(30)_                               |          |           |          | -                                                                                |
| _Ref. `crmLeadCtcId.crmCtcAccId`_                            | _id_                                     |          |           |          | -                                                                                |
| _Ref. `crmLeadCtcId.crmCtcUsrId`_                            | _id_                                     |          |           |          | -                                                                                |
| _Ref. `crmCtcUsrId.usr_login`_                               | _regexp(100)_                            |          |           | yes      | _Login_                                                                          |

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
| `crmMocPriority`                                             | enum(1) using `CRM_MOC_PRIORITY` list    | yes      | yes       |          | -                                                                                |
| `crmMocType`                                                 | enum(20) using `CRMMOCTYPE` list         | yes      | yes       |          | -                                                                                |
| `crmMocContent`                                              | char(30)                                 | yes*     | yes       |          | -                                                                                |
| `crmMocCtcId` link to **`CrmContact`**                       | id                                       | yes      | yes       |          | -                                                                                |
| _Ref. `crmMocCtcId.crmCtcName`_                              | _char(30)_                               |          |           |          | -                                                                                |

### Lists

* `CRM_MOC_PRIORITY`
    - `1` 
    - `2` 
    - `3` 
* `CRMMOCTYPE`
    - `Email` Email
    - `Phone` Mobile
    - `Fax` Fax

