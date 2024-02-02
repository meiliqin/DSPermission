package com.ds.permission

import java.util.*

class PermissionConfig(
    // 权限内容
    val permissions: ArrayList<String>,
    // 权限说明弹窗的内容
    val explanation: String?,
    // 是否显示权限说明弹窗
    var showInstructionDialog: Boolean = true,
    // 是否显示提示前往系统权限设置弹窗,有时间间隔限制
    var showSysSettingDialog: Boolean = true,
    // 忽略时间间隔限制展示设置弹窗
    var forceShowSysSettingDialog: Boolean = false
) {


    class Builder {
        private val permissions = ArrayList<String>()
        private var explanation: String? = null
        private var showInstructionDialog = true
        private var showSysSettingDialog = true
        private var forceShowSysSettingDialog = false

        fun addPermission(permission: String): Builder {
            permissions.add(permission)
            return this
        }

        fun addPermission(permission: Array<String?>): Builder {
            permissions.addAll(Arrays.asList<String>(*permission))
            return this
        }

        fun setExplanation(explanation: String?): Builder {
            this.explanation = explanation
            return this
        }

        fun setShowInstructionDialog(showInstructionDialog: Boolean): Builder {
            this.showInstructionDialog = showInstructionDialog
            return this
        }

        fun setShowSysSettingDialog(showSysSettingDialog: Boolean): Builder {
            this.showSysSettingDialog = showSysSettingDialog
            return this
        }
        fun setForceShowSysSettingDialog(forceShowSysSettingDialog: Boolean): Builder {
            this.forceShowSysSettingDialog = forceShowSysSettingDialog
            return this
        }


        fun build(): PermissionConfig {
            return PermissionConfig(permissions, explanation, showInstructionDialog, showSysSettingDialog, forceShowSysSettingDialog)
        }
    }

}