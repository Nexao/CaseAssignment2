//package rest;
//
//import io.restassured.RestAssured;
//import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;
//import io.restassured.parsing.Parser;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author hh
// */
//public class CompanyRecourceTest 
//{
//    
//    public CompanyRecourceTest() {
//    }
//    
//    @Test
//     public void makeSureThatGoogleIsUp() {
//        given().when().get("http://www.google.com").then().statusCode(200);
//     }
//
//    
//    @BeforeClass
//    public static void setUpBeforeAll() 
//    {
//       RestAssured.baseURI  = "http://localhost:8084";
//       RestAssured.port = 8084;
//       RestAssured.basePath = "C:/Users/hh/Dokumenter/CA2";
//       RestAssured.defaultParser = Parser.JSON;
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//   @Test
//   public void serverIsRunning()
//    {
//        given().
//        when().get().
//        then().
//        statusCode(200);
//    }
//   
//   @Test
//    public void serverIsRunning2()
//    {
//        given().when().get("http://localhost:8084/Test1/").then().statusCode(200);
//    }
////
////    @Test
////    public void testAddPerson() throws Exception
////    {
////        //given().pathParam("n1", "blabla").pathParam("n2", "hansen").
////       // when().get("/api/calculator/add").
//////        then().
//////        statusCode(200).
//////        body("result", notEqualTo(null), "operation", notEqualTo(null));
//////    
////    }
////    
//////    @Test
//////    public void testDeletePerson() throws Exeption
//////    {
//////        given().pathParam("n1", "blabla").pathParam("n2", "hansen").
//////        when().get("/api/calculator/add").
//////        then().
//////        statusCode(200).
//////        body("result", notEqualTo(null), "operation", notEqualTo(null));
//////    
//////    }
//}
