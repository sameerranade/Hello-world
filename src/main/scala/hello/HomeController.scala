package hello

import org.springframework.boot._
import org.springframework.boot.autoconfigure._
import org.springframework.stereotype._
import org.springframework.web.bind.annotation._

import scala.collection.JavaConversions._

object HomeController {
  		def main(args: Array[String]) {
    		SpringApplication.run(classOf[HomeController])
  	}
}

@Controller
@EnableAutoConfiguration
class HomeController {

	@RequestMapping(Array("/"))
  	@ResponseBody
  	def home(): String = "<b>Hello World</b>"
}