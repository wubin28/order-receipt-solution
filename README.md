# Order Receipt 订单小票

## 课程目标与知识点

#### 目标：
* 了解为什么重构；什么时候重构；怎么重构
* 了解最常见的坏味道及对应处理手法

#### 知识点：
* 为遗留代码补充单元测试
* 坏味道：命名含糊 、方法过长 、特性依赖 、（多职责的循环）
* 重构手法：重命名、抽取方法、移动方法、拆分循环

#### 重构要点与步骤
* 发现坏味道
* 安全地重构
  * 测试保护
  * 小步提交
  
![alt text](http://www.plantuml.com/plantuml/png/JPBTYjD05CVlvoaE0K6t5DnR4LdmIbWGz0copI03oQGcinUB25dSxOSsfj06eRRM5jHUI8WWbDgeBzEP95Tv1ITCJ7EJd8_V_vppXpbpcUwmIyj4Z30JmrF7mCuptC6aoo3l--BJ3L_-IbSUGgt7fkwwYe1N2DhFcKFe2w3MCTODmv7PEN7PmtD2yHE6hKTW4lIwrlyloma0jT30RaSL3FloGXxILHcX35wogrAl5ckd6foqsw1PEhtIwcdm03esPJgXBcfwg7dvLwStoOQdMb4wgqWRGQkwhok_h2BktfFdK9jXkB0PioqaWl7XpqSnd70_pg8rzqCU1-cNJJgxuM-NsPlVHJ9IbNpkPL-l-UXMlFlEUxSysXN939r0fHfyo5OR2QkMmYJ0exKORFdOJx_5PNSUyuLN1c6FJwv546H_usCQnda_A5C_FEotCX3UFbylv9Pywl5fb6xUPpztS7h_JhrO4XA58XbKCtxqLKbyJbfDLP4C4QO6bExHcOpao_a7)

## 背景与功能描述

提供打印订单小票的功能，小票需要包括内容：

* 订单列表，内容包括：客户名称，地址，商品描述，商品数量，单价，总额
* 销售税费 10%
* 订单总价 （商品汇总价格+销售税费）

![alter text](http://www.plantuml.com/plantuml/png/JLBDgjD06DtFKtm41BsbuDsAo0LNmWL1do2t6MGWcTHaxgA8a69_McrCeIr2RQqjg5r8Y22KsgWlqvaagxo24oQctOHppfoV6SYLotI7tLecGemm4yDJny3ECzp0fCaWw_lYKuUlVYLh3w7QOrDtNUM0LmZgpvb3w0kWrWdhXk58TarSzl2QKFo4OUiHc0IzhlB_PTa0K0KDx3QKODYtD_8YJSK8PV2IjOgy6jOkDRYerq6pTDhIgZPu00sRCfrG5rLJvuyfBgm4i17Kojcc_BBISVUUNA4smt1ZCsPRI0JZuv-FOZZXVfI66-xFU1GaNxR9lCFVhj8tl_Duf9HiuQLVstpK5U--yrwNX_iydgCBA5E33-bwAytgIDcaWOSRCTZniPzyYuhJHSINNW5cFJvfYo18_qOdEekoVY2fB3mUTX88xv1jbd8bctfy6YRRz-dFFLpUlrCDIuUqGXuFoeuVVIM9pt7jF9N7GuIf0SNh4K9N4XV_n3y0)

#### Action
尝试对现有代码进行检视，找出坏味道并进行重构
