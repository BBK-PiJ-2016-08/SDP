package main.scala.flyweight

/**
  * Created by jakeholdom on 25/04/2017.
  */
import java.util.HashMap
import java.util.Map

object PlatformFactory {

  private val map: Map[String, Platform] = new HashMap[String, Platform]()

  def getPlatformInstance(platformType: String): Platform = {

    var platform = map.get(platformType)

    if(platform == null){

      platform = (code: Code) => platformType
      map.put(platformType, platform)

    }

   platform

  }
  // this method will probably need to be synchronized

}
