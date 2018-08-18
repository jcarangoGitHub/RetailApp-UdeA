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
 * Devolucion
 */
@Validated

public class Devolucion   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("saleId")
  private String saleId = null;

  @JsonProperty("value")
  private BigDecimal value = null;

  @JsonProperty("date")
  private String date = null;

  public Devolucion id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "d12345", required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Devolucion saleId(String saleId) {
    this.saleId = saleId;
    return this;
  }

  /**
   * Get saleId
   * @return saleId
  **/
  @ApiModelProperty(example = "v12345", required = true, value = "")
  @NotNull


  public String getSaleId() {
    return saleId;
  }

  public void setSaleId(String saleId) {
    this.saleId = saleId;
  }

  public Devolucion value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "5000.0", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public Devolucion date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "2018-08-08T08:45:45.001Z", required = true, value = "")
  @NotNull


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Devolucion devolucion = (Devolucion) o;
    return Objects.equals(this.id, devolucion.id) &&
        Objects.equals(this.saleId, devolucion.saleId) &&
        Objects.equals(this.value, devolucion.value) &&
        Objects.equals(this.date, devolucion.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, saleId, value, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Devolucion {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    saleId: ").append(toIndentedString(saleId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

