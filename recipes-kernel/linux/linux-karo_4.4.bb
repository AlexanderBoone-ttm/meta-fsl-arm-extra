SUMMARY = "Linux Kernel for Ka-Ro electronics TX6 Computer-On-Modules"

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "karo-tx6-mainline"
LOCALVERSION = "-2016-03-10"
SRCREV = "03f89bc99b43fcb07414557eb94e3e10002f8ce2"
KERNEL_SRC = "git://git.karo-electronics.de/karo-tx-linux.git;protocol=git"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH} \
           file://defconfig \
"

KERNEL_IMAGETYPE="uImage"

COMPATIBLE_MACHINE  = "(tx6[qsu]-.*|txul-.*)"