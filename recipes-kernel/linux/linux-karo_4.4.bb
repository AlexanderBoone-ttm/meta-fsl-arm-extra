SUMMARY = "Linux Kernel for Ka-Ro electronics TX Computer-On-Modules"

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "master"
LOCALVERSION = "-2016-01-18"
SRCREV = "afd2ff9b7e1b367172f18ba7f693dfb62bdcb2dc"
KERNEL_SRC = "git://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git;protocol=git"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH} \
           file://defconfig \
           file://0001-ARM-dts-imx6ul-whitespace-cleanup-no-functional-chan.patch \
           file://0002-ARM-dts-imx6ul-move-tsc-node-to-appropriate-place-in.patch \
           file://0003-ARM-dts-imx6ul-move-dt-bindings-input-input.h-includ.patch \
           file://0004-ARM-dts-imx6-change-TX6-module-names-due-to-new-HW-r.patch \
           file://0004-ARM-dts-imx6ul-specify-proper-clocks-for-GPT-node.patch \
           file://0005-ARM-dts-imx6-add-support-for-more-Ka-Ro-electronics-.patch \
           file://0005-ARM-dts-imx6ul-specify-proper-clocks-for-the-PWM-nod.patch \
           file://0006-ARM-dts-imx6ul-disable-PWMs-by-default.patch \
           file://0007-ARM-dts-imx6ul-add-pwm-1-4-nodes.patch \
           file://0008-ARM-dts-imx6ul-add-sdma-support.patch \
           file://0009-ARM-dts-imx6ul-add-flexcan-support.patch \
           file://0010-ARM-dts-imx6ul-add-sai-support.patch \
           file://0011-ARM-dts-imx6ul-add-lcdif-support.patch \
           file://0012-ARM-dts-imx6ul-add-gpmi-support.patch \
           file://0013-clk-imx-whitespace-cleanup-no-functional-change.patch \
           file://0014-clk-imx-add-kpp-clock-for-i.MX6UL.patch \
           file://0015-ARM-dts-imx6ul-add-kpp-support.patch \
           file://0016-ARM-dts-imx6ul-add-support-for-Ka-Ro-electronics-TXU.patch \
"

KERNEL_IMAGETYPE="uImage"

COMPATIBLE_MACHINE = "(tx6[qsu]-.*|txul.*)"