package com.ec2application.ec2application;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.ec2.model.StopInstancesRequest;

public class EC2Stop
{
    private static final AWSCredentials AWS_CREDENTIALS;
    
    static {
        // Your accesskey and secretkey
        AWS_CREDENTIALS = new BasicAWSCredentials(
                "id",
                "secretkey"
        );
    }
    public static void main(String[] args) {
        
        // Set up the amazon ec2 client
        AmazonEC2 ec2Client = AmazonEC2ClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(AWS_CREDENTIALS))
                .withRegion(Regions.US_EAST_1)
                .build();
        
        //Stop EC2 Instance
        String instanecID = "i-0739c0ea4202ef40f";
        StopInstancesRequest stopInstancesRequest = new StopInstancesRequest()
                .withInstanceIds(instanecID);
         
        ec2Client.stopInstances(stopInstancesRequest)
                .getStoppingInstances()
                .get(0)
                .getPreviousState()
                .getName();
        System.out.println("Stopped the Instnace with ID: "+instanecID);
    }

}
