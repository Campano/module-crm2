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
| `crmCtcName`                                                 | char(30)                                 | yes*     | yes       |          | -                                                                                |
| `crmAccEmployee`                                             | int(10)                                  |          | yes       |          | -                                                                                |

`CrmContact` business object definition
---------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `crmCtcName`                                                 | char(30)                                 | yes*     | yes       |          | -                                                                                |
| `crmCtcAccId` link to **`CrmAccount`**                       | id                                       | yes      | yes       |          | -                                                                                |
| _Ref. `crmCtcAccId.crmAccName`_                              | _char(30)_                               |          |           |          | -                                                                                |
| `crmContactSimpleUserid` link to **`SimpleUser`**            | id                                       |          | yes       |          | -                                                                                |
| _Ref. `crmContactSimpleUserid.usr_login`_                    | _regexp(100)_                            |          |           | yes      | _Login_                                                                          |

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

