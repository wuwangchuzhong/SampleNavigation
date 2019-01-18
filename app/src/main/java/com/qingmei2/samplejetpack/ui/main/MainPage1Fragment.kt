package com.qingmei2.samplejetpack.ui.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.qingmei2.samplejetpack.R
import kotlinx.android.synthetic.main.fragment_main_page1.*

class MainPage1Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_main_page1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn.setOnClickListener {
            /**
             * 此时的id作为唯一的响应action，id然后作出一系列的动作
             * 此时navHostFragment中findNavController（）方法实现就是通过遍历view树，直到找见最底部navhostfragment中的NavController对象，然后返回来
             * 控制器的对象
             *
             * navController 控制器的设计
             * 1.解析布局文件中的nav—graph-main。xml
             * 2.通过解析xml，可以深度看出文中的Destination 目标点和 class对象
             * 3.记录fragment中的顺序
             * 4.管理fragment之间
             *
             * navController中具体通过 mInflater的对象来解析 xml文件中的Destination（就是本文中的fragment1，fragment2，fragment3）的class对象，
             * 此时我们应该设计一个Destination的接口，使navController不应该只为fragment服务，抽象出来，实现了这个接口不管是activity，还是fragment，都仅仅是一个
             * Destination目标点而已，
             *
             * NavDestination和Navigator
             * 问题？此时抽象出来的接口，怎么去判断fragment于activity呢？就用到了 navigator
             *
             * navigator
             * 1.能够实例话对象NavDestination
             * 2.能够指定的进入fragment
             * 3.能够退出framgnt
             *
             * 可以看出
             * NavController在获取了NavDestination的所有实例对象后，不管它是怎么前进，后退，只管引用即可，
             *
             */
            Navigation.findNavController(it).navigate(R.id.action_page2)
        }
    }

}
