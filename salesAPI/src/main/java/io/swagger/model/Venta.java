package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Venta
 */
@Validated

public class Venta   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("orderId")
  private String orderId = null;

  @JsonProperty("value")
  private BigDecimal value = null;

  @JsonProperty("date")
  private String date = null;

  @JsonProperty("salesmanId")
  private String salesmanId = null;

  public Venta id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "v12345", required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Venta orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(example = "o12345", required = true, value = "")
  @NotNull


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public Venta value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "10000.0", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public Venta date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "2018-08-01T09:12:33.001Z", required = true, value = "")
  @NotNull


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Venta salesmanId(String salesmanId) {
    this.salesmanId = salesmanId;
    return this;
  }

  /**
   * Get salesmanId
   * @return salesmanId
  **/
  @ApiModelProperty(example = "s12345", required = true, value = "")
  @NotNull


  public String getSalesmanId() {
    return salesmanId;
  }

  public void setSalesmanId(String salesmanId) {
    this.salesmanId = salesmanId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Venta venta = (Venta) o;
    return Objects.equals(this.id, venta.id) &&
        Objects.equals(this.orderId, venta.orderId) &&
        Objects.equals(this.value, venta.value) &&
        Objects.equals(this.date, venta.date) &&
        Objects.equals(this.salesmanId, venta.salesmanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderId, value, date, salesmanId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Venta {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    salesmanId: ").append(toIndentedString(salesmanId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

