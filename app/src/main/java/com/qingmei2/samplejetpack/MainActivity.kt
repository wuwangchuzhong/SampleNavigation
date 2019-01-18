package com.qingmei2.samplejetpack

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.Navigation.findNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //意味着将它的back键交出去，如果当前并非是栈中顶部的fragment，就是返回上一个fragment
    /**
     * NavHostFragment
     * 作用就是承载其他fragment，作为一个容器
     * 在其中就是在oncraetview（）中初始化了一个FrameLayout，作为viewgroup的载体，导航并展示其fragment
     *1.作为导航的载体 FrameLayout
     *2.控制及其管理fragment之间的关系 NavController
     * 这里我们将getNavController 的持有者抽象成一个接口，成为这个navhost
     */
    override fun onSupportNavigateUp() =
            findNavController(this, R.id.my_nav_host_fragment).navigateUp()
}
