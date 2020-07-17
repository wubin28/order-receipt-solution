# Order Receipt 订单小票

## 重构要点与步骤
* 发现坏味道
* 安全地重构
  * 测试保护
  * 小步提交
  
![alt text](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuR9wkgVXQVz4QovTEuMdwtgUTKnusZN_HVFUfnFwhBdACp9pKXKqWFBF-cOysRtu-OB6ftFxdqxS_B9nigP2PZ5GQksCftDMm0NjDRcu51IidgxhVDgwucLxxxDvBTPWWGtzpzOkVTO_uSck9TPSgNafO9Evk8fByWku781ye5C0)

## 背景与功能描述

提供打印订单小票的功能，小票需要包括内容：

* 订单列表，内容包括：客户名称，地址，商品描述，商品数量，单价，总额
* 销售税费 10%
* 订单总价 （商品汇总价格+销售税费）

![alter text](http://www.plantuml.com/plantuml/png/JLBDgjD06DtFKtm41BsbuDsAo0LNmWL1do2t6MGWcTHaxgA8a69_McrCeIr2RQqjg5r8Y22KsgWlqvaagxo24oQctOHppfoV6SYLotI7tLecGemm4yDJny3ECzp0fCaWw_lYKuUlVYLh3w7QOrDtNUM0LmZgpvb3w0kWrWdhXk58TarSzl2QKFo4OUiHc0IzhlB_PTa0K0KDx3QKODYtD_8YJSK8PV2IjOgy6jOkDRYerq6pTDhIgZPu00sRCfrG5rLJvuyfBgm4i17Kojcc_BBISVUUNA4smt1ZCsPRI0JZuv-FOZZXVfI66-xFU1GaNxR9lCFVhj8tl_Duf9HiuQLVstpK5U--yrwNX_iydgCBA5E33-bwAytgIDcaWOSRCTZniPzyYuhJHSINNW5cFJvfYo18_qOdEekoVY2fB3mUTX88xv1jbd8bctfy6YRRz-dFFLpUlrCDIuUqGXuFoeuVVIM9pt7jF9N7GuIf0SNh4K9N4XV_n3y0)

Action：尝试对现有代码进行检视，找出坏味道并进行重构
