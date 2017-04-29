package xyz.liuyibo.cv
import xyz.liuyibo.cv.Helper._

/**
  * Created by liuyibo on 2017/4/29.
  */

object 刘毅博 {
  val 工作经验 = Years.ONE
  val 关键技能 = "scala, c++, python, java, js, shell, Spark, Hadoop, Hbase, 分布式系统，算法"
  val 竞争力 = "ACM 区域赛(EC-Final)金牌, 学习能力强, 技术栈广泛, 对代码有追求"
  val 英语 = CET6
}

class 刘毅博 {
  val 教育经历 = Seq(
    本科(北京航空航天大学, 2012.9 - 2016.7)
  )
  val 工作经历 = Seq(
    Job(阿里巴巴神马搜索商业搜索开发工程师,
      时间 = 2016.7 - Now,
      工作内容 = "开发维护神马商搜反作弊系统，反作弊数据可视化开发，神马搜索基础架构消息队列的开发",
      项目经历 = (
        反作弊系统的开发维护 -> (2016.8 - Now, "在商业搜索系统中，反作弊模块是一个不可或缺的模块，其目的是筛选掉作弊流量，保证广告主利益。目前反作弊系统在Storm上运行，使用python，配合python-c extension"),
        反作弊数据可视化 -> (2016.8 - 2017.3, "为了更加方便地了解各策略在线上的影响，以及流量的一些统计信息，需要有一个工具对流量进行分析并展示。目前该项目分为几部分。第一部分是实时性较高但分析内容较为有限的实时counter服务，目的为了在异常时快速定位问题。通过将统计数据直接存储到redis实现。第二部分实时性较低但加入了一定量的数据分析。首先将调试数据导入到消息队列，再使用spark将数据转为parquet存储到HDFS，使用spark sql进行数据计算，将结果用BulkLoad方式导入到Hbase，主要使用scala开发。第三部分是数据展示部分，前端使用React框架开发，ui基于boostrap/antd，后端使用python的flask框架，读取redis，Hbase等数据库进行处理并返回"),
        消息队列开发 -> (2017.3 - Now, "神马商搜消息队列使用c++进行开发，我主要对神马商搜消息中间件的性能和稳定性进行优化。我对该项目的代码风格以及结构提出了一些建议，找出了一定量的bug，优化了异步发送在一些情况下的性能")
      )
      // Tucao = "大厦味道太呛，代码看起来太难受"
    )
  )
}

object About {
  val Name = 刘毅博
  val Age = 23
  val Tel = "13581780024"
  val Mail = "liuyibo1994@qq.com"
  val QQ = 593979359
  val Version = 2017/4/29

  val ^-^ = "北京，好工作环境，强力队友，感觉这年头不整点人工智能机器学习区块链啥的都不算学计算机的"
}
// This CV can be downloaded at https://github.com/liuyibo/CV.git
