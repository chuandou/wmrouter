package com.mola.lib.routerlib

import android.app.Application
import com.sankuai.waimai.router.Router
import com.sankuai.waimai.router.common.DefaultRootUriHandler

/**
 *
 * Created by wt on 2020/7/2
 */
class DemoApp : Application() {
    override fun onCreate() {
        super.onCreate()
        // 创建RootHandler
        val rootHandler = DefaultRootUriHandler(this)
        // 初始化
        Router.init(rootHandler)
    }
}