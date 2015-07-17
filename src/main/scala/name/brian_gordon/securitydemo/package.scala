package name.brian_gordon

import java.util.concurrent.Executors

import scala.concurrent.ExecutionContext

import com.typesafe.config.ConfigFactory

/**
 * @author Brian Gordon
 */
package object securitydemo {
    val conf = ConfigFactory.load()
    implicit val executor = ExecutionContext.fromExecutorService(Executors.newCachedThreadPool());
}
