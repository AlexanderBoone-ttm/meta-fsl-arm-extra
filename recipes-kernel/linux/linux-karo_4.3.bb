SUMMARY = "Linux Kernel for Ka-Ro electronics TX6UL Computer-On-Modules"

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "karo-tx6-next"
LOCALVERSION = "-2015-11-10"
SRCREV = "5d4754a6369ee09242b17ce47d2c56f4ccb107d2"
KERNEL_SRC = "git://git.karo-electronics.de/karo-tx-linux.git;protocol=git"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH} \
           file://defconfig \
"

KERNEL_IMAGETYPE="uImage"

COMPATIBLE_MACHINE  = "(txul-.*)"