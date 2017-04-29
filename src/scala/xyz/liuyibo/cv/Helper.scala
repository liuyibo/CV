package xyz.liuyibo.cv

/**
  * Created by liuyibo on 2017/4/29.
  */
object Helper {
  object Years {
    val ONE = 1
  }
  val CET6 = "cet6"
  case class 本科(name: String, time: Double)
  val 北京航空航天大学 = "buaa"

  case class Job(name: String, 时间: Double, 工作内容: String, 项目经历: Any)
  def Now: Double = 2017.4
  val 阿里巴巴神马搜索商业搜索开发工程师 = "ali.smcs.dev"
  val 反作弊系统的开发维护 = "antispam.dev"
  val 反作弊数据可视化 = "antispam.virualization"
  val 消息队列开发 = "message_queue.dev"

  val 刘毅博 = "liuyibo"
}

