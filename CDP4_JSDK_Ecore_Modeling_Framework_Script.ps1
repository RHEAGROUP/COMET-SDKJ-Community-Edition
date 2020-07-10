﻿Set-ExecutionPolicy Unrestricted
$srcFile = "C:\Users\kwojnowski\workspace-papyrus\cdp4emfmodel\model\CDP4.ecore"  # source file 
$dstFile = "C:\Users\kwojnowski\workspace-papyrus\cdp4emfmodel\model\CDP4_JSDK.ecore"  # destination file

$pattern1 = 'xsi:type="ecore:(EReference|EAttribute)" (?<attributes>[-?a-zA-Z0-1\s\"\=]* eType="#//CommonData/(String|Uuid|Boolean|Integer|LongInteger|Date|Uri|LanguageCode|TimeOfDay|DateTime|ParameterFormulaType|ParameterValueType|Sha1HashType|ClassKind)")([a-zA-Z0-1\s\"\=]*)(?<close>)'
$pattern2 = 'xsi:type="ecore:EAttribute" (?<attributes>[-?a-zA-Z0-1\s\"\=]*) eType="ecore:EDataType ../../org.eclipse.uml2.types/model/Types.ecore#//Real"([a-zA-Z0-1\s\"\=]*)(?<close>)'
$pattern3 = '(?ms)\s*<eSubpackages name="Ecore_Profile" nsURI="http:///CDP4/Ecore_Profile.ecore" nsPrefix="CDP4.Ecore_Profile">\s*\s*<eClassifiers xsi:type="ecore:EClass" name="EcoreExportServiceInformation" eSuperTypes="MagicDrawProfile.ecore#//InvisibleStereotype">\s*\s*<eStructuralFeatures xsi:type="ecore:EReference" name="base_Package" ordered="false"\s*\s*lowerBound="1" eType="ecore:EClass ../../org.eclipse.uml2.uml/model/UML.ecore#//Package"/>\s*\s*<eStructuralFeatures xsi:type="ecore:EAttribute" name="ecoreExportPath" ordered="false"\s*\s*lowerBound="1" eType="ecore:EDataType ../../org.eclipse.uml2.types/model/Types.ecore#//String"/>\s*\s*</eClassifiers>\s*\s*</eSubpackages>\s*\s*<eSubpackages name="UMLStandardProfile" nsURI="http:///CDP4/UMLStandardProfile.ecore"\s*\s*nsPrefix="CDP4.UMLStandardProfile">\s*\s*<eAnnotations source="http://www.eclipse.org/uml2/2.0.0/UML">\s*\s*<details key="originalName" value="UML Standard Profile"/>\s*\s*</eAnnotations>\s*\s*<eAnnotations source="http://www.eclipse.org/emf/2002/GenModel">\s*\s*</eAnnotations>\s*\s*</eSubpackages>\s*'
$newValue1 = 'xsi:type="ecore:EAttribute" ${attributes}${close}'
$newValue2 = 'xsi:type="ecore:EAttribute" ${attributes} eType="#//CommonData/Float ${close}"'
$newValue3 = ''
$newValue4 = 
    '
    <eClassifiers xsi:type="ecore:EDataType" name="Float" instanceClassName="java.lang.Float">
      <eAnnotations source="http://www.eclipse.org/emf/2002/GenModel">
        <details key="documentation" value="&lt;html>&#xA;  &lt;head>&#xA;&#x9;&#x9;&lt;style>&#xA;&#x9;&#x9;&#x9;p {padding:0px; margin:0px;}&#xA;&#x9;&#x9;&lt;/style>&#xA;&#x9;&lt;/head>&#xA;  &lt;body>&#xA;    &lt;p>&#xA;datatype that represents an Float number in the closed interval 1.4E-45 (=-2&lt;sup>31&lt;/sup>) to 3.4028235E38 (=2&lt;sup>31&lt;/sup>-1)&#xA;    &lt;/p>&#xA;&#xA;    &lt;p>&#xA;Note:&amp;#160;The float data type is a single-precision 32-bit IEEE 754 floating point XML&amp;#160;Schema &lt;i>float&lt;/i> datatype, see &lt;a href=&quot;http://www.w3.org/TR/xmlschema-2/#float&quot;>http://www.w3.org/TR/xmlschema-2/#float&lt;/a>.&#xA;&#xA;    &lt;/p>&#xA;&#xA;  &lt;/body>&#xA;&lt;/html>&#xA;"/>
      </eAnnotations>
    </eClassifiers>'

(Get-Content -Path $srcFile).Replace('<eClassifiers xsi:type="ecore:EClass" name="String">', '<eClassifiers xsi:type="ecore:EDataType" name="String" instanceClassName="java.lang.String">').Replace('<eClassifiers xsi:type="ecore:EClass" name="Uuid">', '<eClassifiers xsi:type="ecore:EDataType" name="Uuid" instanceClassName="java.lang.String">').Replace('<eClassifiers xsi:type="ecore:EClass" name="Boolean">', '<eClassifiers xsi:type="ecore:EDataType" name="Boolean" instanceClassName="java.lang.Boolean">').Replace('<eClassifiers xsi:type="ecore:EClass" name="Integer">', '<eClassifiers xsi:type="ecore:EDataType" name="Integer" instanceClassName="java.lang.Integer">').Replace('<eClassifiers xsi:type="ecore:EClass" name="LongInteger">', '<eClassifiers xsi:type="ecore:EDataType" name="LongInteger" instanceClassName="java.lang.Long">').Replace('<eClassifiers xsi:type="ecore:EClass" name="Date" eSuperTypes="#//CommonData/String">', '<eClassifiers xsi:type="ecore:EDataType" name="Date" instanceClassName="java.time.OffsetDateTime">').Replace('<eClassifiers xsi:type="ecore:EClass" name="Uri" eSuperTypes="#//CommonData/String">', '<eClassifiers xsi:type="ecore:EDataType" name="Uri" instanceClassName="java.lang.String">').Replace('<eClassifiers xsi:type="ecore:EClass" name="LanguageCode" eSuperTypes="#//CommonData/String">', '<eClassifiers xsi:type="ecore:EDataType" name="LanguageCode" instanceClassName="java.lang.String">').Replace('<eClassifiers xsi:type="ecore:EClass" name="TimeOfDay" eSuperTypes="#//CommonData/String">', '<eClassifiers xsi:type="ecore:EDataType" name="TimeOfDay" instanceClassName="java.lang.String">').Replace('<eClassifiers xsi:type="ecore:EClass" name="DateTime" eSuperTypes="#//CommonData/String">', '<eClassifiers xsi:type="ecore:EDataType" name="DateTime" instanceClassName="java.time.OffsetDateTime">').Replace('<eClassifiers xsi:type="ecore:EClass" name="ParameterFormulaType" eSuperTypes="#//CommonData/String">', '<eClassifiers xsi:type="ecore:EDataType" name="ParameterFormulaType" instanceClassName="java.lang.String">').Replace('<eClassifiers xsi:type="ecore:EClass" name="ParameterValueType" eSuperTypes="#//CommonData/String">', '<eClassifiers xsi:type="ecore:EDataType" name="ParameterValueType" instanceClassName="java.lang.String">').Replace('<eClassifiers xsi:type="ecore:EClass" name="Sha1HashType" eSuperTypes="#//CommonData/String">', '<eClassifiers xsi:type="ecore:EDataType" name="Sha1HashType" instanceClassName="java.lang.String">').Replace('<eClassifiers xsi:type="ecore:EEnum" name="ClassKind">', '<eClassifiers xsi:type="ecore:EDataType" name="ClassKind" instanceClassName="java.lang.String">').Replace('<eStructuralFeatures xsi:type="ecore:EReference" name="point" unique="false"', '<eStructuralFeatures xsi:type="ecore:EReference" name="point"').Replace('<details key="documentation" value="UML Standard Profile contains UML metamodel (metaclasses without properties and associations), StandardProfileL2 and StandardProfileL3 from UML specification, Standard UML stereotypes defined in annex C of UML specification.&#xA;Profile also includes validation suites for UML model correctness and completeness checking, and stereotypes used by MagicDraw internally."/>', '') | Set-Content -Path $dstFile
(Get-Content -Path $dstFile -Raw) -replace $pattern1, $newValue1 | Set-Content -Path $dstFile 
(Get-Content -Path $dstFile -Raw) -replace $pattern2, $newValue2 | Set-Content -Path $dstFile 
(Get-Content -Path $dstFile -Raw) -replace $pattern3, $newValue3 | Set-Content -Path $dstFile 

$pattern = [regex]'<eClassifiers xsi:type="ecore:EDataType" name="Integer" instanceClassName="java.lang.Integer">'
$lineNum = (Select-String -Pattern $pattern -Path $dstFile).lineNumber

$fileContent = Get-Content -Path $dstFile
$fileContent[$lineNum-2] += $newValue4
$fileContent | Set-Content -Path $dstFile 