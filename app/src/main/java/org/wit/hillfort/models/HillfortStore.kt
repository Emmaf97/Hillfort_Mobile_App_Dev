package org.wit.hillfort.models

interface HillfortStore {
  fun findAll(): List<HillfortModel>
  fun create(placemark: HillfortModel)
  fun update(placemark: HillfortModel)
  fun delete(placemark: HillfortModel)
  fun findById(id:Long) : HillfortModel?
  fun clear()
}