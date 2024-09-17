const base = {
    get() {
        return {
            url : "http://localhost:8080/xinwenzixunxitong/",
            name: "xinwenzixunxitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xinwenzixunxitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "新闻资讯系统"
        } 
    }
}
export default base
