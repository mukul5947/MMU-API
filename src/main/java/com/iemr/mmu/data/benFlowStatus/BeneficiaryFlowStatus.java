package com.iemr.mmu.data.benFlowStatus;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.gson.annotations.Expose;
import com.iemr.mmu.data.masterdata.registrar.GenderMaster;

/***
 * 
 * @author NE298657
 *
 */
@Entity
@Table(name = "i_ben_flow_outreach")
public class BeneficiaryFlowStatus {

	@Id
	@GeneratedValue
	@Expose
	@Column(name = "ben_flow_id")
	private Long benFlowID;

	@Expose
	@Column(name = "beneficiary_reg_id")
	private Long beneficiaryRegID;

	@Expose
	@Column(name = "beneficiary_visit_id")
	private Long benVisitID;

	@Expose
	@Column(name = "beneficiary_visit_code")
	private Long benVisitCode;

	@Expose
	@Column(name = "visit_reason")
	private String VisitReason;

	@Expose
	@Column(name = "visit_category")
	private String VisitCategory;

	@Expose
	@Column(name = "visit_no")
	private Short benVisitNo;

	@Expose
	@Column(name = "nurse_flag")
	private Short nurseFlag;

	@Expose
	@Column(name = "doctor_flag")
	private Short doctorFlag;

	@Expose
	@Column(name = "pharmacist_flag")
	private Short pharmacist_flag;

	@Expose
	@Column(name = "lab_technician_flag")
	private Short lab_technician_flag;

	@Expose
	@Column(name = "radiologist_flag")
	private Short radiologist_flag;

	@Expose
	@Column(name = "oncologist_flag")
	private Short oncologist_flag;

	@Expose
	@Column(name = "specialist_flag")
	private Short specialist_flag;

	@Expose
	@Column(name = "created_by")
	private String agentId;

	@Expose
	@Column(name = "created_date", insertable = false, updatable = false)
	private Timestamp visitDate;

	@Expose
	@Column(name = "modified_by")
	private String modified_by;

	@Expose
	@Column(name = "modified_date", insertable = false)
	private Timestamp modified_date;

	@Expose
	@Column(name = "ben_name")
	private String benName;

	@Expose
	@Column(name = "deleted", insertable = false)
	private Boolean deleted;

	@Transient
	private String firstName;
	@Transient
	private String lastName;

	@Expose
	@Column(name = "ben_age")
	private String age;

	@Expose
	@Column(name = "ben_age_val")
	private Integer ben_age_val;

	@Expose
	@Column(name = "ben_dob")
	private Timestamp dOB;

	@Expose
	@Column(name = "ben_gender_val")
	private Short genderID;

	@Expose
	@Column(name = "ben_gender")
	private String genderName;

	@Expose
	@Column(name = "ben_phone_no")
	private String preferredPhoneNum;

	@Expose
	@Column(name = "father_name")
	private String fatherName;

	@Expose
	@Column(name = "spouse_name")
	private String spouseName;

	@Expose
	@Column(name = "district")
	private String districtName;

	@Expose
	@Column(name = "servicePoint")
	private String servicePointName;

	public String getServicePointName() {
		return servicePointName;
	}

	public void setServicePointName(String servicePointName) {
		this.servicePointName = servicePointName;
	}

	@Expose
	@Column(name = "village")
	private String villageName;
	@Expose
	@Column(name = "beneficiary_id")
	private Long beneficiaryID;

	@Expose
	@Column(name = "lab_iteration_cnt")
	private Short labIteration;

	@Transient
	private I_bendemographics i_bendemographics;
	@Transient
	private List<BenPhoneMaps> benPhoneMaps;
	@Transient
	private String benImage;
	@Transient
	private Integer ageVal;
	@Transient
	private Timestamp serviceDate;
	@Transient
	private String beneficiaryName;
	@Transient
	private Timestamp createdDate;
	@Transient
	private String createdBy;
	@Transient
	private GenderMaster m_gender;

	public BeneficiaryFlowStatus() {
	}

	public BeneficiaryFlowStatus(Long benFlowID, Long benRegID, Timestamp visitDate, String benName, String age,
			Integer ageVal, Short genderID, String genderName, String villageName, String districtName,
			Long beneficiaryID, String servicePoint) {
		this.benFlowID = benFlowID;
		this.beneficiaryRegID = benRegID;
		this.serviceDate = visitDate;
		this.beneficiaryName = benName;
		this.age = age;
		this.ageVal = ageVal;
		this.genderID = genderID;
		this.genderName = genderName;
		this.villageName = villageName;
		this.districtName = districtName;
		this.createdDate = visitDate;
		this.beneficiaryID = beneficiaryID;
		this.servicePointName = servicePoint;

	}

	public GenderMaster getM_gender() {
		return m_gender;
	}

	public void setM_gender(GenderMaster m_gender) {
		this.m_gender = m_gender;
	}

	public Integer getAgeVal() {
		return ageVal;
	}

	public void setAgeVal(Integer ageVal) {
		this.ageVal = ageVal;
	}

	public Timestamp getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(Timestamp serviceDate) {
		this.serviceDate = serviceDate;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public static BeneficiaryFlowStatus getBeneficiaryFlowStatusForLeftPanel(ArrayList<Object[]> objList) {
		BeneficiaryFlowStatus obj = null;
		if (objList != null && objList.size() > 0) {
			for (Object[] objArr : objList) {
				obj = new BeneficiaryFlowStatus((Long) objArr[0], (Long) objArr[1], (Timestamp) objArr[2],
						(String) objArr[3], (String) objArr[4], (Integer) objArr[5], (Short) objArr[6],
						(String) objArr[7], (String) objArr[8], (String) objArr[9], (Long) objArr[10],
						(String) objArr[11]);
			}
		}
		return obj;
	}

	public Long getBenFlowID() {
		return benFlowID;
	}

	public void setBenFlowID(Long benFlowID) {
		this.benFlowID = benFlowID;
	}

	public Long getBeneficiaryRegID() {
		return beneficiaryRegID;
	}

	public void setBeneficiaryRegID(Long beneficiaryRegID) {
		this.beneficiaryRegID = beneficiaryRegID;
	}

	public Long getBenVisitID() {
		return benVisitID;
	}

	public void setBenVisitID(Long benVisitID) {
		this.benVisitID = benVisitID;
	}

	public Long getBenVisitCode() {
		return benVisitCode;
	}

	public void setBenVisitCode(Long benVisitCode) {
		this.benVisitCode = benVisitCode;
	}

	public String getVisitReason() {
		return VisitReason;
	}

	public void setVisitReason(String visitReason) {
		VisitReason = visitReason;
	}

	public String getVisitCategory() {
		return VisitCategory;
	}

	public void setVisitCategory(String visitCategory) {
		VisitCategory = visitCategory;
	}

	public Short getBenVisitNo() {
		return benVisitNo;
	}

	public void setBenVisitNo(Short benVisitNo) {
		this.benVisitNo = benVisitNo;
	}

	public Short getNurseFlag() {
		return nurseFlag;
	}

	public void setNurseFlag(Short nurseFlag) {
		this.nurseFlag = nurseFlag;
	}

	public Short getDoctorFlag() {
		return doctorFlag;
	}

	public void setDoctorFlag(Short doctorFlag) {
		this.doctorFlag = doctorFlag;
	}

	public Short getPharmacist_flag() {
		return pharmacist_flag;
	}

	public void setPharmacist_flag(Short pharmacist_flag) {
		this.pharmacist_flag = pharmacist_flag;
	}

	public Short getLab_technician_flag() {
		return lab_technician_flag;
	}

	public void setLab_technician_flag(Short lab_technician_flag) {
		this.lab_technician_flag = lab_technician_flag;
	}

	public Short getRadiologist_flag() {
		return radiologist_flag;
	}

	public void setRadiologist_flag(Short radiologist_flag) {
		this.radiologist_flag = radiologist_flag;
	}

	public Short getOncologist_flag() {
		return oncologist_flag;
	}

	public void setOncologist_flag(Short oncologist_flag) {
		this.oncologist_flag = oncologist_flag;
	}

	public Short getSpecialist_flag() {
		return specialist_flag;
	}

	public void setSpecialist_flag(Short specialist_flag) {
		this.specialist_flag = specialist_flag;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public Timestamp getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Timestamp visitDate) {
		this.visitDate = visitDate;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	public Timestamp getModified_date() {
		return modified_date;
	}

	public void setModified_date(Timestamp modified_date) {
		this.modified_date = modified_date;
	}

	public String getBenName() {
		return benName;
	}

	public void setBenName(String benName) {
		this.benName = benName;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Integer getBen_age_val() {
		return ben_age_val;
	}

	public void setBen_age_val(Integer ben_age_val) {
		this.ben_age_val = ben_age_val;
	}

	public Timestamp getdOB() {
		return dOB;
	}

	public void setdOB(Timestamp dOB) {
		this.dOB = dOB;
	}

	public Short getGenderID() {
		return genderID;
	}

	public void setGenderID(Short genderID) {
		this.genderID = genderID;
	}

	public String getGenderName() {
		return genderName;
	}

	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}

	public String getPreferredPhoneNum() {
		return preferredPhoneNum;
	}

	public void setPreferredPhoneNum(String preferredPhoneNum) {
		this.preferredPhoneNum = preferredPhoneNum;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public Long getBeneficiaryID() {
		return beneficiaryID;
	}

	public void setBeneficiaryID(Long beneficiaryID) {
		this.beneficiaryID = beneficiaryID;
	}

	public Short getLabIteration() {
		return labIteration;
	}

	public void setLabIteration(Short labIteration) {
		this.labIteration = labIteration;
	}

	public I_bendemographics getI_bendemographics() {
		return i_bendemographics;
	}

	public void setI_bendemographics(I_bendemographics i_bendemographics) {
		this.i_bendemographics = i_bendemographics;
	}

	public List<BenPhoneMaps> getBenPhoneMaps() {
		return benPhoneMaps;
	}

	public void setBenPhoneMaps(List<BenPhoneMaps> benPhoneMaps) {
		this.benPhoneMaps = benPhoneMaps;
	}

}
