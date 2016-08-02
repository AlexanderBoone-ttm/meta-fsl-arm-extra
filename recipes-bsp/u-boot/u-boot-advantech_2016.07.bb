require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "U-Boot for Advantech i.MX6 DMS-BA16 based platforms"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"
DEPENDS = "u-boot-mkimage-native"

PROVIDES = "u-boot"

SRCREV = "16a26705252aac106e196d2f9593845539c73837"
SRC_URI = "git://github.com/Freescale/u-boot-fslc.git;branch=2016.07+fslc"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(imx6q-dms-ba16)"
