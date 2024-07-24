import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import wenzhang from '@/views/modules/wenzhang/list'
    import wenzhangCollection from '@/views/modules/wenzhangCollection/list'
    import wenzhangLiuyan from '@/views/modules/wenzhangLiuyan/list'
    import yonghu from '@/views/modules/yonghu/list'
    import zimeitiren from '@/views/modules/zimeitiren/list'
    import config from '@/views/modules/config/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShangxia from '@/views/modules/dictionaryShangxia/list'
    import dictionaryShiyong from '@/views/modules/dictionaryShiyong/list'
    import dictionaryWenzhang from '@/views/modules/dictionaryWenzhang/list'
    import dictionaryWenzhangCollection from '@/views/modules/dictionaryWenzhangCollection/list'
    import dictionaryWenzhangErji from '@/views/modules/dictionaryWenzhangErji/list'
        import dictionaryWenzhangErjiAddOrUpdate from '@/views/modules/dictionaryWenzhangErji/add-or-update'//二级





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShangxia',
        name: '上下架',
        component: dictionaryShangxia
    }
    ,{
        path: '/dictionaryShiyong',
        name: '使用类型',
        component: dictionaryShiyong
    }
    ,{
        path: '/dictionaryWenzhang',
        name: '频道类型',
        component: dictionaryWenzhang
    }
    ,{
        path: '/dictionaryWenzhangCollection',
        name: '收藏表类型',
        component: dictionaryWenzhangCollection
    }
    ,{
        path: '/dictionaryWenzhangErji',
        name: '文章类型',
        component: dictionaryWenzhangErji
    }
    ,{
        path: '/dictionaryWenzhangErjiAddOrUpdate',
        name: '文章类型的新增修改页面',
        component: dictionaryWenzhangErjiAddOrUpdate
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/wenzhang',
        name: '文章',
        component: wenzhang
      }
    ,{
        path: '/wenzhangCollection',
        name: '文章收藏',
        component: wenzhangCollection
      }
    ,{
        path: '/wenzhangLiuyan',
        name: '文章留言',
        component: wenzhangLiuyan
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }
    ,{
        path: '/zimeitiren',
        name: '自媒体人',
        component: zimeitiren
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
