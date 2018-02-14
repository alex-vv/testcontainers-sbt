import com.dimafeng.testcontainers.{Container, ForAllTestContainer, PostgreSQLContainer}
import org.scalatest.{Matchers, WordSpec}

class ContainerSpec extends WordSpec with Matchers with ForAllTestContainer {
  override val container: Container = PostgreSQLContainer()
  
  "ContainerSpec" should {
    
    "pass" in {
      1 shouldBe 1
    }
  }
}